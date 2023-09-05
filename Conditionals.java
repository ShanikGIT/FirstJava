public class Conditionals {
    
 public static void main(String[] args) {
//we will start if else from here

int age = 71;
if(age>=18 && age<60)
{
  System.out.println("adult");
}
else if(age<18) 
{
    System.out.println("not adult");
}
else if (age>60 && age<70)
{
    System.out.println("turning to bruddh");
}
else{
    System.out.println("braddh");
}
//we will start ternarry statements from here 

int a = 12;
int b = 4;
int c = 11;
String result = (a<b)?"a is lesser":"b is lesser";
System.out.println(result);

//we will start switch case from here 

String name = "sunny";
switch(name)
{
    case "honey":System.out.println("case 1");
    break;
    case "sunny":System.out.println("case 2");
    break;
    case "bunny":System.out.println("case 3");
    break;
}
}
}