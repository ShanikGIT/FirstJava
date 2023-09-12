//Area Calculator(square,rectangle,circle) designing  without 4 pillers of oops

import java.util.Scanner;
class Square
{
    float length;
    float area;
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the square");
        length = scan.nextFloat();
    }
    public void compute()
    {
        area = length * length;
    }
    public void disp()
    {
        System.out.println("The area of the square :"+area );
    }
}
class Rectanle
{
    float length;
    float width;
    float area;
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
    public void disp()
    {
        System.out.println("The area pf the rectangle :"+area );
    }
}
class Circle
{
    float radius;
    float area;
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
    public void disp()
    {
        System.out.println("The area pf the circle :"+area );
    }
}

class ACWOP 
{
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectanle r = new Rectanle();
        Circle c = new Circle();
        s.acceptInput();
        s.compute();
        s.disp();
        r.acceptInput();
        r.compute();
        r.disp();
        c.acceptInput();
        c.compute();
        c.disp();
    }
}