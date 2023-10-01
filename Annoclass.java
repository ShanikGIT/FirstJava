interface Car
{
    void drive();
}

class Annoclass
{
    public static void main(String[] args)
    {
        Car obj = new Car()
        {
            public void drive()
            {
                  System.out.println("driving");
            }
        };
        obj.drive();
    }
}