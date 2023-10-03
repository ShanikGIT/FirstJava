import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.*;

public class Generics1 
{
    public static void main(String[] args) 
    {
      String str[] = new String[5];
      str[0] = "Nikhil";
      str[1] = "Sharma";
      ArrayList al = new ArrayList();                 //it can store hetrogenius type of data
      //typesafety achieved with generics(<String>)
      ArrayList<String> a2 = new ArrayList<String>(); //But now it will store String type of data only
       al.add("Utkarsh");
       al.add("sharma");
       al.add(13);

       String a = (String)al.get(0);
       //char b =  a.charAt(0);
       System.out.println(a);
  
       
       

    }
}
