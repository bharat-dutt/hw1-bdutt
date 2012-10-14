package org.apache.uima.GeneTaggingTypeSystem;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;
import java.io.*;

public class GeneTaggingCasConsumer extends CasConsumer_ImplBase {

  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    // TODO Auto-generated method stub
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }

    try
    {
    BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\Users\\BharatDutt\\Desktop\\sample1.out"));
    FSIterator iter = jcas.getAnnotationIndex(Gene.type).iterator();
    while(iter.hasNext())
    {
      Gene FinalAnnotate = (Gene)iter.next();
      outputFile.write(FinalAnnotate.getID() +"|"+ FinalAnnotate.getStartSpan() +" "+FinalAnnotate.getEndSpan()+"|"+ FinalAnnotate.getName() + "\n");
    }
    }
    catch(IOException ioE)
    {
      ioE.printStackTrace();
    }
  }

}
