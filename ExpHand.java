import java.util.*;
class Test 
{
    public void beta() throws Exception
    {
        Scanner scan = new Scanner(System.in);
   try{
        System.out.println("a: ");
       int a =  scan.nextInt();
       System.out.println("b: ");
        int b =  scan.nextInt();
       System.out.println(a/b);
         }
  catch(Exception e)
         {
            System.out.println("you cant devide a number by 0");
            throw e;
         }
    finally{
         System.out.println("iF you will not write me in under finally keyword i would mot be printed");
         }
    }
}
public class ExpHand
{
    public static void main(String[] args) 
    {
   try{
    Test A = new Test();
     A.beta();
    }
    catch(Exception e)
    {
        System.out.println("exp occures in main method ");
    }
}
}
