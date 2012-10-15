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

public class GeneTaggingAbnerNER extends JCasAnnotator_ImplBase {

  /**
   * Gets the SourceText type annotations and converts them into Gene type annotations
   * @param aJCas
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIndex  SourceDocindex = aJCas.getAnnotationIndex(SourceText.type);
    Iterator sourceIter = SourceDocindex.iterator();
    Tagger BioCreativeTagger = new Tagger(); // Using Abner 
    
    //PosTagNamedEntityRecognizer ner = new PosTagNamedEntityRecognizer();
    while(sourceIter.hasNext())
    {
      SourceText source = (SourceText)sourceIter.next();
      
        Gene InterAnnot = new Gene(aJCas);  
        String[] AbnerTestProtein = BioCreativeTagger.getEntities(source.getSourceText(), "PROTEIN");
        String[] AbnerTestDNA = BioCreativeTagger.getEntities(source.getSourceText(), "DNA");
        String[] AbnerTestRNA = BioCreativeTagger.getEntities(source.getSourceText(), "RNA");
        String[] AbnerTestCellType = BioCreativeTagger.getEntities(source.getSourceText(), "CELL-TYPE");
        String[] AbnerTestCellLine = BioCreativeTagger.getEntities(source.getSourceText(), "CELL-LINE");
        String sourceRWS = source.getSourceText();
     
      
       //Getting gene spans
        if(AbnerTestProtein.length != 0)
        {
          for(int i = 0; i<AbnerTestProtein.length;i++)
          {     
           //System.out.println("gotProtein\n");
           InterAnnot.setID(source.getSentenceID());
           InterAnnot.setName(AbnerTestProtein[i]);
          //Trim both strings
          sourceRWS = sourceRWS.replaceAll(" ", "");
          AbnerTestProtein[i]=AbnerTestProtein[i].replaceAll(" ", "");
          int StartSpan = sourceRWS.indexOf(AbnerTestProtein[i]);
          //int StartSpan = source.getSourceText().indexOf(AbnerTestProtein[i]);
          InterAnnot.setStartSpan(StartSpan);
          InterAnnot.setEndSpan(StartSpan+AbnerTestProtein[i].length()-1);
          InterAnnot.addToIndexes(aJCas);
          }
        }
        
        if(AbnerTestRNA.length != 0)
        {
          for(int i = 0; i<AbnerTestRNA.length;i++)
          {
            System.out.println("gotRNA\n");
           InterAnnot.setID(source.getSentenceID());
           InterAnnot.setName(AbnerTestRNA[i]);
          //Trim both strings
           sourceRWS = sourceRWS.replaceAll(" ", "");
          AbnerTestRNA[i]=AbnerTestRNA[i].trim().replaceAll(" ", "");
          int StartSpan = sourceRWS.indexOf(AbnerTestRNA[i]);
          InterAnnot.setStartSpan(StartSpan);
          InterAnnot.setEndSpan(StartSpan+AbnerTestRNA[i].length()-1);
          InterAnnot.addToIndexes(aJCas);
          }
        }
        
        if(AbnerTestDNA.length != 0)
        {
          for(int i = 0; i<AbnerTestDNA.length;i++)
          {           
            //System.out.println("gotDNA\n");
           InterAnnot.setID(source.getSentenceID());
           InterAnnot.setName(AbnerTestDNA[i]);
          //Trim both strings
           sourceRWS = sourceRWS.replaceAll(" ", "");
          AbnerTestDNA[i]=AbnerTestDNA[i].replaceAll(" ", "");
          int StartSpan = sourceRWS.indexOf(AbnerTestDNA[i]);
          InterAnnot.setStartSpan(StartSpan);
          InterAnnot.setEndSpan(StartSpan+AbnerTestDNA[i].length()-1);
          InterAnnot.addToIndexes(aJCas);
          }
        }
        
        if(AbnerTestCellLine.length != 0)
        {
          for(int i = 0; i<AbnerTestCellLine.length;i++)
          {           
            //System.out.println("gotCellLine\n");
           InterAnnot.setID(source.getSentenceID());
           InterAnnot.setName(AbnerTestCellLine[i]);
          //Trim both strings
           sourceRWS = sourceRWS.replaceAll(" ", "");
          AbnerTestCellLine[i]=AbnerTestCellLine[i].replaceAll(" ", "");
          int StartSpan = sourceRWS.indexOf(AbnerTestCellLine[i]);
          InterAnnot.setStartSpan(StartSpan);
          InterAnnot.setEndSpan(StartSpan+AbnerTestCellLine[i].length()-1);
          InterAnnot.addToIndexes(aJCas);
          }
        }
        
        if(AbnerTestCellType.length != 0)
        {
          for(int i = 0; i<AbnerTestCellType.length;i++)
          {           
            //System.out.println("gotCellType\n");
           InterAnnot.setID(source.getSentenceID());
           InterAnnot.setName(AbnerTestCellType[i]);
          //Trim both strings
           sourceRWS = sourceRWS.replaceAll(" ", "");
          AbnerTestCellType[i]=AbnerTestCellType[i].replaceAll(" ", "");
          int StartSpan = sourceRWS.indexOf(AbnerTestCellType[i]);
          InterAnnot.setStartSpan(StartSpan);
          InterAnnot.setEndSpan(StartSpan+AbnerTestCellType[i].length()-1);
          InterAnnot.addToIndexes(aJCas);
          }
        }
               
    }
    
    
  }

}
