package org.apache.uima.GeneTaggingTypeSystem;

import java.io.*;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;

public class GeneTaggingCollectionReader extends CollectionReader_ImplBase {

  Boolean hasNext = true;
  
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    // TODO Auto-generated method stub
    
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    BufferedReader inputFile = new BufferedReader(new FileReader("C:\\Users\\BharatDutt\\Desktop\\sample.in"));
    
    //Breaking each sentence into ID and text
    String a[] = null;
    String str;
    while((str = inputFile.readLine()) != null)
    {
    a = str.split(" ",2);
    SourceText mySource = new SourceText(jcas);
    mySource.setSentenceID(a[0]);
    //System.out.println("a1 = " + a[1]);
    mySource.setSourceText(a[1]);
    mySource.addToIndexes(jcas);
    }
    
    jcas.setDocumentText(FileUtils.reader2String(inputFile)); //for book-keeping
    
    hasNext = false;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    return hasNext;
  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }
  
   }


