//Encapsulation refers to a process of preventing direct access to the data members by declaring data members as private and
//providing controlled access to the data members by using setters and getters which are nothing but the public methods

// Here is the example of a book class , we all know that the page numbers of a book can't be a negative number ,so anyone who is 
// accessing the pageNo from the main method don't assign the negative integer so we prevented the diect access to the data member
// by declaring it as private, but if the users cant access it then how they would assign even a valid value 
//so here we gave them a controlled access by using setters and getters 
//controlled access is nothing but the validation that they are giving a valid value 


class Book
{
   private int pageNo;

   public void setData(int x)
   {
       if(x>0)
       {
        pageNo = x;
       }
       else
       {
        System.out.println("not a valid input");
       }
   }
   public int getData()
   { 
    if(pageNo > 0)
    {
     return pageNo;
    }
    else
    {
      System.out.println("not a valid input");
      return 0;
    }
   }
}

class Dog                                  
{
    private String bread;
    private float age;
    private int price;
    
    public Dog()
    {
        System.out.println("hi doggy");
    }
   
 public Dog(String bread,float age,int price)   //Constuctor - having the same name as of the class and does not have any return type 
    {
        this.bread = bread;
        this.age = age;
        this.price = price;
    }
    public String getBread()
    {
        return bread;
    }
     public float getAge()
    {
        return age;
    }
     public int getPrice()
    {
        return price;
    }

}

class Encapsulation
{
    public static void main(String[] args)
    {
     Book b = new Book();
     b.setData(100);
    System.out.println(b.getData());

     Dog d = new Dog("Pitbull",2.5f,10000);    //Constructor calling -  at the time of the object creation
    System.out.println(d.getBread());
    System.out.println(d.getAge());
    System.out.println(d.getPrice());
     
   
     Dog d2 = new Dog();                  // Constructor overloading

    }
}