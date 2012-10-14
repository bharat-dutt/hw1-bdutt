package org.apache.uima.GeneTaggingTypeSystem;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import abner.Tagger;

public class GeneTaggingAEStanfordNLP extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIndex  SourceDocindex = aJCas.getAnnotationIndex(SourceText.type);
    Iterator sourceIter = SourceDocindex.iterator();
    Tagger BioCreativeTagger = new Tagger(Tagger.BIOCREATIVE);
    
    try
    {
    PosTagNamedEntityRecognizer ner = new PosTagNamedEntityRecognizer();
    while(sourceIter.hasNext())
    {
      SourceText source = (SourceText)sourceIter.next();
      Map<Integer, Integer> InterMap = ner.getGeneSpans(source.getSourceText());// new HashMap<Integer, Integer>(); 
      // Reading the map to get the annotations per sentence
      Set<Map.Entry<Integer, Integer>> entries = InterMap.entrySet();
      for(Map.Entry<Integer, Integer> entry : entries) {
        Gene InterAnnot = new Gene(aJCas);  
        //using Abner database to annotate the gene names
        String interEntity = source.getSourceText().substring(entry.getKey(),entry.getValue());
        
        String AbnerTestResults = BioCreativeTagger.tagABNER(interEntity);
        if(AbnerTestResults.contains("PROTEIN") || AbnerTestResults.contains("DNA") || AbnerTestResults.contains("RNA") || AbnerTestResults.contains("cell line") || AbnerTestResults.contains("cell type"))
        {
          InterAnnot.setStartSpan(entry.getKey());
          //System.out.println(entry.getKey());
          InterAnnot.setEndSpan(entry.getValue());
          //System.out.println(entry.getValue());
          InterAnnot.setID(source.getSentenceID());        
          InterAnnot.setName(source.getSourceText().substring(entry.getKey(),entry.getValue()));
          InterAnnot.addToIndexes(aJCas);
        }     
               
    }
    }
    }
    catch(ResourceInitializationException Re)
    {
      Re.printStackTrace();
    }
    
    
  }

}
