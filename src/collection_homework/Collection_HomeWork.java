/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_homework;

 import java.util.*;
import java.io.PrintWriter;

class Test_ArrayList {
    public ArrayList<Integer>testingArray;
    public ArrayList<Integer>testCollection;
    
    Test_ArrayList() {
       testingArray = new ArrayList<>(); 
       testCollection = new ArrayList<>(); 
       for(int i = 0 ;i < last_value; ++i)
           testCollection.add(i);
    }
    
    public long last_value;
    public long test_add;
    public long test_get;
    public long test_remove;
    public long test_contains;
    public long test_populate;
    public long test_iterator_add;
    public long test_iterator_remove;
    public void testing_add(){
          for(int i = 0; i < last_value; ++i)
            testingArray.add(i);
          //testingArray.
         }
    public void testing_get(){
         for(int i = 0; i < last_value; ++i)
            testingArray.get(i);
    }
      public void testing_contains(){
         for(int i = 0; i < last_value; ++i)
            testingArray.contains(i);
    }
      
    
  
      public void testing_remove(){
          int i = 0;
         while(i < testingArray.size())
         {
             
            testingArray.remove(i);
            ++i;
         }
    }
      
   public void testing_populate()
   {
    testingArray.addAll(testCollection);
   }
      
   public void testing_iterator_remove(){
       Iterator<Integer>iterator=testingArray.iterator();
       while(iterator.hasNext())
       {
         Integer value = iterator.next();
         iterator.remove();
       }
                
    }   
    
    
    @Override
    public String toString() {
         return "ArrayList " + "\tadd = "+ test_add+"\tget = " + test_get+"\tcontains = "+test_contains
                 +"\tremove = "+test_remove+"\tpopulate = "+test_populate+
                 "\ttest_iterator_remove = "+test_iterator_remove;
    }
}

class Test_LinkedList {
    public LinkedList<Integer>testingList;
     public ArrayList<Integer>testCollection;
    Test_LinkedList() {
       testingList = new LinkedList<>(); 
       testCollection = new ArrayList<>(); 
       for(int i = 0 ;i < last_value; ++i)
           testCollection.add(i);
    }
    
    public long last_value;
    public long test_add;
    public long test_get;
    public long test_remove;
    public long test_contains;
    public long test_populate;
    public long test_iterator_add;
    public long test_iterator_remove;
    public void testing_add(){
      
        for(int i = 0; i < last_value; ++i)
        testingList.add(i);
  //      System.out.println(testingList.size());
  
    }
   public void testing_get(){
        for(int i = 0; i < last_value; ++i) //Більше 10000 не ставити  бо програма буде  зависати
            testingList.get(i);
        } 
   
   public void testing_contains(){
         for(int i = 0; i < last_value; ++i)
            testingList.contains(i);
    }
   
     public void testing_remove(){
         
       int i = 0;
         while(i < testingList.size())
         {
             
            testingList.remove(i);
            ++i;
         }    
    }
     
       public void testing_populate()
   {
    testingList.addAll(testCollection);
   }
   
        public void testing_iterator_remove(){
       Iterator<Integer>iterator=testingList.iterator();
       while(iterator.hasNext())
       {
         Integer value = iterator.next();
         iterator.remove();
       }
                
    }
   
    
    @Override
    public String toString() {
      return "LinkedList " + "\tadd = "+ test_add+"\tget = " + test_get+"\tcontains = "+test_contains
                 +"\tremove = "+test_remove+"\tpopulate = "+test_populate+
              "\ttest_iterator_remove = "+test_iterator_remove;
    }
}

class Test_HashSet {
      public HashSet<Integer>testHashSet;
      public ArrayList<Integer>testCollection;
    Test_HashSet() {
       testHashSet = new HashSet<>();
       testCollection = new ArrayList<>(); 
       for(int i = 0 ;i < last_value; ++i)
           testCollection.add(i);
       
    }
    
    public long last_value;
    public long test_add;
    public long test_get;
    public long test_remove;
    public long test_contains;
    public long test_populate;
    public long test_iterator_add;
    public long test_iterator_remove;
        public void testing_add(){
      
        for(int i = 0; i < last_value; ++i)
        testHashSet.add(i);
  
    }
   
   public void testing_contains(){
         for(int i = 0; i < last_value; ++i)
            testHashSet.contains(i);
    }

   
     public void testing_remove(){
        int i = 0;
         while(i < testHashSet.size())
         {
             
            testHashSet.remove(i);
            ++i;
         }    
    }
       public void testing_populate()
   {
    // testHashSet.  
    testHashSet.addAll(testCollection);
   }    
     
  @Override
    public String toString() {
        return "HashSet " + "\t add = "+ test_add+"\t contains = " + test_contains+
                "\t remove = "+test_remove+"\tpopulate = "+test_populate;
}
}

class Test_TreeSet {
    public TreeSet<Integer>testTreeSet;
    public ArrayList<Integer>testCollection;
    Test_TreeSet() {
       testTreeSet = new TreeSet<>(); 
       testCollection = new ArrayList<>(); 
       for(int i = 0 ;i < last_value; ++i)
           testCollection.add(i);
    }
    
    public long last_value;
    public long test_add;
    public long test_get;
    public long test_remove;
    public long test_contains;
     public long test_populate;
 
        public void testing_add(){
      
        for(int i = 0; i < last_value; ++i)
        testTreeSet.add(i);
  
    }
   
   public void testing_contains(){
         for(int i = 0; i < last_value; ++i)
            testTreeSet.contains(i);
    }
  
     public void testing_remove(){
          int i = 0;
         while(i < testTreeSet.size())
         {
             
            testTreeSet.remove(i);
            ++i;
         }   
    }
     
      public void testing_populate()
   {
    testTreeSet.addAll(testCollection);
   }    
      
 @Override
    public String toString() {
        return "TreeSet " + "\t add = "+ test_add+"\t contains = " + test_contains+"\t remove = "+test_remove
                +"\tpopulate = "+test_populate; 
 }
}


public class Collection_HomeWork {
    

    public static void main(String[] args) {
        
        
 try {
      PrintWriter testfile = new PrintWriter("TestColections.txt");       
 Test_ArrayList testArray = new  Test_ArrayList(); 
 testArray.last_value = 10000;
 long start = System.nanoTime();
 testArray.testing_add();
 long end = System.nanoTime();
 testArray.test_add = end-start;  
start = System.nanoTime();
testArray.testing_get();
end = System.nanoTime();
testArray.test_get = end-start;
start = System.nanoTime();
testArray.testing_contains();
end = System.nanoTime();
testArray.test_contains = end-start;
start = System.nanoTime();
testArray.testing_remove();
end = System.nanoTime();
testArray.test_remove = end-start;
start = System.nanoTime();
testArray.testing_populate();
end = System.nanoTime();
testArray.test_populate = end-start;
start = System.nanoTime();
testArray.testing_iterator_remove();
end = System.nanoTime();
testArray.test_iterator_remove = end-start;
System.out.println (testArray) ;

testfile.printf(testArray.toString());    
testfile.println();
         
        
  Test_LinkedList testList = new  Test_LinkedList();
  testList.last_value = 10000;
  start = System.nanoTime();
 testList.testing_add();
  end = System.nanoTime();
 testList.test_add = end-start;  
start = System.nanoTime();
testList.testing_get();
end = System.nanoTime();
testList.test_get = end-start;
start = System.nanoTime();
testList.testing_contains();
end = System.nanoTime();
testList.test_contains = end-start;
start = System.nanoTime();
testList.testing_remove();
end = System.nanoTime();
testList.test_remove = end-start;
start = System.nanoTime();
testList.testing_populate();
end = System.nanoTime();
testList.test_populate = end-start;
start = System.nanoTime();
testList.testing_iterator_remove();
end = System.nanoTime();
testList.test_iterator_remove = end-start;

 System.out.println (testList) ;
 testfile.printf(testList.toString());    
testfile.println();
 
 Test_HashSet testHash = new  Test_HashSet();
  testHash.last_value = 10000;
  start = System.nanoTime();
 testHash.testing_add();
  end = System.nanoTime();
 testHash.test_add = end-start;  
start = System.nanoTime();
testHash.testing_contains();
end = System.nanoTime();
testHash.test_contains = end-start;
start = System.nanoTime();
testHash.testing_remove();
end = System.nanoTime();
testHash.test_remove = end-start;
start = System.nanoTime();
testHash.testing_populate();
end = System.nanoTime();
testHash.test_populate = end-start;

 System.out.println (testHash) ;
 testfile.printf(testHash.toString());    
testfile.println();
 
  Test_TreeSet testTree = new  Test_TreeSet();
  testTree.last_value = 10000;
  start = System.nanoTime();
 testTree.testing_add();
  end = System.nanoTime();
 testTree.test_add = end-start;  
start = System.nanoTime();
testTree.testing_contains();
end = System.nanoTime();
testTree.test_contains = end-start;
start = System.nanoTime();
testTree.testing_remove();
end = System.nanoTime();
testTree.test_remove = end-start;
start = System.nanoTime();
testTree.testing_populate();
end = System.nanoTime();
testTree.test_populate = end-start;

 System.out.println (testTree) ;
 testfile.printf(testTree.toString());    
testfile.println();
 
  testfile.close();
    }
      catch(Exception e) { System.err.println(e);
    }
 
    }
}
