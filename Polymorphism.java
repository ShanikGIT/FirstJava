//PolyMorphism

class Plane                               //Parent class 
{
    public void takeOff()
        {
          System.out.println("Taking off");
        }
    public void fly()
        {
          System.out.println("flying");
        }
    public void land()
        {
          System.out.println("Landing");
        }
}
//Inheritence th overridden methods
class CargoPlane extends Plane                                 //child class 
{
        public void takeOff()
        {
          System.out.println("taking off on low speed");
        }
       public void fly()
        {
          System.out.println("flying slowly");
        }
        public void land()
        {
          System.out.println("landing slowly");
        } 
}
//Inheritence th overridden methods
class PassangerPlane extends Plane                                           //child class
{
     public void takeOff()
        {
          System.out.println("taking off on medium speed");
          
        }

    public void fly()
        {
          System.out.println("flying on medium medium");
        }
        public void land()
        {
          System.out.println("landing on medium speed");
        }
}
//Inheritence th overridden methods
class FighterPlne extends Plane                                              //child class
{
     public void takeOff()
        {
          System.out.println("taking off on high speed");
          
        }
    public void fly()
        {
          System.out.println("flying high");
        }
        public void land()
        {
          System.out.println("landing on high speed");
        }
}
//Created a method for repetation of same instructions on different location
class Airport
{
  public void info(Plane ref)
  {
     ref.takeOff();
     ref.fly();
      ref.land();
      
  }
}

class Polymorphism
{
    public static void main(String[] args)
    {
      CargoPlane cp = new CargoPlane();
      PassangerPlane pp = new PassangerPlane();
      FighterPlne fp = new FighterPlne();
      Airport a =new Airport();
      //Plane ref;                                              //loose couplling
      
      //ref = cp;
      a.info(cp);
     
     // ref = pp;
      a.info(pp);
   
     // ref = fp;
      a.info(fp);
    
    }
}