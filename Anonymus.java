/**
 * Anonymus
 */
public class Anonymus {

    void abc(int a){
        int c=a+5;
        System.out.println(c);
    }
     void abc(int a,int b){
        int c=a+b+5;
        System.out.println(c);
    }
     void abc(int a,int b, int d){
        int c=a+b+d+5;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Anonymus obj= new Anonymus();
        obj.abc(5);
        obj.abc(5, 7);
        obj.abc(4, 6, 7);
   
        
    }
}