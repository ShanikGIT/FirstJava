class calc{
public int add(int n1,int n2){
    int result = n1+n2;
    return result;
}


public double add(double n1, double n2){
    double result = n1+n2;
    return result;
}

}
public class Calculator {
    public static void main(String[] args) {
        calc obj = new calc();
       
        int res2 = obj.add(20,5);
        double res3 = obj.add(20.5,5.1);
      
       System.out.println("answer"+res2);
      System.out.println(res3);

    }
}
