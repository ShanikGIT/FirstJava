import java.util.Scanner;

public class fact {
    public static void main(String args[]){

    Scanner m1 = new Scanner(System.in);
    System.out.print("enter the number  ");
    int n1 = m1.nextInt();
    int fact =1;
    for(int i = 1; i <= n1; i++){
       fact = fact*i;
    }
    System.out.println(fact);
   
}
}