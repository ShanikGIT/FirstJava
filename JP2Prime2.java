import java.util.*;
public class JP2Prime2
{
    public static void main(String[] args) 
    {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Start NO: ");
            int num1 = scan.nextInt();
            System.out.print("Enter the end No: ");
            int num2 = scan.nextInt();
            int flag = 0;
            
            for(int i = num1; i<=num2;i++)
            {
                if(i==2)
                {
                    System.out.println(i);
                    continue;
                }
                for (int j = 2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag = 0;
                        break;
                    }
                    else
                    {
                        flag = i;
                    }
                }
                if(flag!=0)
                {
                    System.out.println(flag);
                }
            }
    }
}
