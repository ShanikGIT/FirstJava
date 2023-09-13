interface Finterface                                                   //Function interface (having only one abstract method)
{
   int square(int n);         
}
class lambdaa
{
   public static void main(String[] args)
   {
      Finterface lambda = n->3*3;
      System.out.println(lambda.square(3));
}
}