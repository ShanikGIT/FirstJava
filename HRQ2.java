//String palidrom
import java.util.Scanner;

public class HRQ2 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str="";
        
     
        for (int i =str1.length()-1; i>=0; i--)
        {
            char ch = str1.charAt(i);
            str = ""+str+ch+"";
        }
      System.out.print(str);
      boolean n = str.equals(str1);
      if(n){
        System.err.println("Yes");
       }
       else{
        System.err.println("NO");
       }
}
}