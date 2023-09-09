//mthods are classified in two categories
 //(1) Pre Deffined ,Such as : println() ,Scanner() etc...
 //(2) User deffinrd ,Such as :  add() , mul() ,info() , eating() etc......
 //They are of 4 types : //(1)- "No input No output"
                         //(2)- No input But output
                         //(3)- Input But No output
                         //(4)- Input and output  

class Calculator                                   //class that name is "Calculator"
{      
    int a,b,res;                                    //"instance vaariables" declared
                                  
    void add1()                                      //(1)- "No input No output"
   {
        a = 5;
        b = 6;
        res = a+b;
        System.out.println(res);
   }    

   int add2()                                      //(2)- No input But output
   {
      a = 5;
      b = 6;
      res = a+b;
      return res;
   }

   void add3(int a,int b)                         //(3)- Input But No output (we dont have to declare "instance variable")
   {
     res = a+b;
     System.out.println(res);
      
   }

   int add4(int a,int b)                          //(4)- Input and output           
   {
    res = a+b;
    return res;

   }
}

class methods                                       //main class
{                                    
    public static void main(String[] args)          //main method
    {
        Calculator calc = new Calculator();         //object creation that is from Calcultor class
        
        

        calc.add1();                                //method calling   ("No input No output")
         
        int sum1 = calc.add2();                     //method calling   ("No input and output")
        System.out.println(sum1);

        calc.add3(5,6);                         //method calling  ("input but no output")
   
        int sum2 = calc.add4(5,6);              //method calling  ("input and output")
   
        System.out.println(sum2);

    }

}

