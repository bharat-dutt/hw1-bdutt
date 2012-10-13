package org.apache.uima.GeneTaggingTypeSystem;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;

import java.util.*;

public class GeneTaggingAEStanfordNLP extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIndex  SourceDocindex = aJCas.getAnnotationIndex(SourceText.type);
    Iterator sourceIter = SourceDocindex.iterator();
    try
    {
    PosTagNamedEntityRecognizer ner = new PosTagNamedEntityRecognizer();
    while(sourceIter.hasNext())
    {
      //System.out.println("iter hasnext \n");
      getContext().getLogger().log(Level.FINEST,"inside has next");
      String AnnotReturn = null;
      SourceText source = (SourceText)sourceIter.next();
      Map<Integer, Integer> InterMap = new HashMap<Integer, Integer>(); 
      InterMap = ner.getGeneSpans(source.getSourceText(), AnnotReturn); 
      // Reading the map to get the annotations per sentence
      Set<Map.Entry<Integer, Integer>> entries = InterMap.entrySet();
      for(Map.Entry<Integer, Integer> entry : entries) {
        IntermediateAnnotations InterAnnot = new IntermediateAnnotations(aJCas);  
        InterAnnot.setStartSpan(entry.getKey());
        InterAnnot.setEndSpan(entry.getValue());
        InterAnnot.setID(source.getSentenceID());
        InterAnnot.setName(source.getSourceText().substring(InterAnnot.getStartSpan(), InterAnnot.getEndSpan()));
        InterAnnot.addToIndexes(aJCas);
    }
    }
    }
    catch(ResourceInitializationException Re)
    {
      Re.printStackTrace();
    }
    
    
  }

}
