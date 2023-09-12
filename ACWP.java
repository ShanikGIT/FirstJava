//Area Calculator(square,rectangle,circle) designing wit all 4 pillars of OOPS

import java.util.Scanner;
abstract class Shape                                                      //abstract class/parenst class/super class 
{
    float area;
    abstract public void acceptInput();
    abstract public void compute();
     public void disp()
     {
       System.out.println("The Area :"+area);
     }

}
class Square extends Shape                                               //child class / sublcass
{
    private float length;                                                //Encapsulation
    
    public void acceptInput()                                            //overridden inheritence
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the square");
        length = scan.nextFloat();
    }
    public void compute()                                                //overridden inheritence
    {
        area = length * length;
    }
                                                                         // inherited disp()
}
class Rectanle extends Shape
{
   private float length;
   private float width;
   
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = scan.nextFloat();
        System.out.println("Enter the width of the rectangle");
        width = scan.nextFloat();
    }
    public void compute()
    {
        area = length * width ;
    }
   
}
class Circle extends Shape
{
   private float radius;
   
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the redius of the circle");
        radius = scan.nextFloat();
    }
    public void compute()
    {
        area = 3.14f * radius*radius;
    }
   
    
}
class Geometry
{
    public void permit(Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}

class ACWP 
{
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectanle r = new Rectanle();
        Circle c = new Circle();
        Geometry v = new Geometry();                                   

       v.permit(s);                                            //polymorphism
       v.permit(r);
       v.permit(c);
    }
}