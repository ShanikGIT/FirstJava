import java.util.*; 
import java.math.*;
public class Testt {
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);

     int q = scan.nextInt();

   
     for(int i= 1; i<=q; i++)
     {
        int a = scan.nextInt();
      
         int b = scan.nextInt();
        
         int n = scan.nextInt();
         System.out.println(a+" "+b+" "+n);
         int x = a + (int)Math.pow(2,0) *b;

         for(int j = 1; j<=n; j++)
         {
         
          System.out.print(x+" ");
         x = x + (int)Math.pow(2,j)*b;
        
         }
         
    }
    }
  }
       

      
    


