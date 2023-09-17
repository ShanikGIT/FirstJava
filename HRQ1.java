import java.io.*;
import java.util.*;

public class HRQ1 {

    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String A = scan.nextLine();
    String B = scan.nextLine();
    String C = A+B;
    String A1 = A.substring(0,1).toUpperCase();
    String A2 = A.substring(1);
     String A3 = A.substring(0,1).toUpperCase()+ A.substring(1);
     String B1 = B.substring(0,1).toUpperCase();
     String B2 = B.substring(1);
     String B3 = B.substring(0,1).toUpperCase()+ B.substring(1);
         
          System.out.println(C.length());
          int res = A.compareTo(B);
          if(res >0)
          {
               System.out.println("Yes");
          }
          else {
               System.out.println("No");
          }
           
            System.out.println(A3+" "+B3);
 
    }
}




