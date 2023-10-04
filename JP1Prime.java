import java.util.*;
public class JP1Prime 
{
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enetr the number: ");
      int num,ans =0;
      int flag = 0;
      num = scan.nextInt();
      for(int i = 1; i*i<=num; i++)
      {
       ans = i;
      }
         for (int i = 2; i <=ans; i++)
        {
            if(num%i==0)
            {
               flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
}
}
