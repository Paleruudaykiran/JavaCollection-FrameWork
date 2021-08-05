package collectionFrameWrok;
import java.util.*;
class ArrayListDemo { 
    public static void main(String[] args) { 
       // ArrayList is a class implement from List interface
       // where List interface is extends from collection interface
       // so ArrayList is child of List class
       // we can store both homogeneous and heterogeneous data in ArrayList
       // index based and allows duplicate elements

       // Syntax ArrayList <TypeOfData> name = new ArrayList <TypeOfData>();

       // for storing hetorogeneous data no need to specify TypeOfData
       ArrayList<String> arr = new ArrayList<String>(); 

       // following are the methods in collection interface
       arr.add("Abc"); 
       arr.add("Def"); 
       System.out.println(arr); 

       arr.remove("Def"); 
       System.out.println(arr);
       arr.remove(0) ;
       System.out.println(arr.isEmpty());
       
       arr.add("Java");
       arr.add("Python"); 
       arr.add("Javascript"); 
       arr.add("cpp"); 
       System.out.println(arr);
       
       System.out.println(arr.size());
       System.out.println(arr.contains("c++"));

       // following are the methods in List 
       arr.add(0,"c"); 
       arr.add(1,"html");
       System.out.println(arr.get(2));
       arr.set(2,"css");
       System.out.println(arr);

       // sort function is method in collections class
       Collections.sort(arr);
       System.out.println(arr);
        
       for(int i = 0;i<arr.size();i++) 
          System.out.println(arr.get(i));
       // for each loop on the ArrayList 
       for(String s : arr)
          System.out.println(s);
       for(Object ob : arr) 
          System.out.println(ob);
       Iterator i = arr.iterator(); 
       while(i.hasNext()) 
          System.out.print(i.next() + " ");

    }
}