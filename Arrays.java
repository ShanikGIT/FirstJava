public class Arrays {
    public static void main(String[] args){

       // 1-D Array : it consists row only (i)
       System.out.println("1-D Array-");

        int a1[] = {1,2,4,5}; //1-D array if we know the values of array
        
        for(int a : a1){
            System.out.print(a + " ");
        }

        int a2[] = new int[4]; //1-D array if we know the size of the array only 
        a2[0]=1; //here we are giving the vlues of the array by specifying its index number
        a2[1]=2;
        a2[2]=4;
        a2[3]=5;
          for(int a : a1){
            System.out.print(a + " ");
        }
         
        System.out.println();
         System.out.println();
        System.out.println("2-D Array-");
       

       // 2-D Array : it consists row and column (i&j)

        int b1[][]={{1,2},{3,4},{5,6}}; //2-D array when we know the values
         
        for(int bOne[]:b1){
            for(int bTwo : bOne ){
                System.out.print(bTwo + " ");
            }
            System.out.println();

        }

        int b2[][] = new int[3][2]; //2-D array when we know the size of the array only
        b2[0][0]=1; //here we are giving the vlues of the array by specifying its index number i & j
        b2[1][0]=3;
        b2[1][1]=4;
        b2[2][0]=5;
        b2[2][1]=6;

        for(int bOne[]:b1){
            for(int bTwo : bOne ){
                System.out.print(bTwo + " ");
            }
            System.out.println();
         
        }
         System.out.println();
        System.out.println("Jagged Array-");

        

    //Jagged Array : those arrays which can have diffrent no. of elements for diffrent no. pf rows

    int c1[][] = {{1,2,3},{4,5},{6,7,8,9}}; // Jagged array when we know thw values

  for(int cOne[]:c1){
    for(int cTwo:cOne){
         System.out.print(cTwo + " ");
       }
      System.out.println();
}     
     
     int c2[][] = new int[3][]; // Jagged array where we know the no. of the rows only
     c2[0] = new int[3]; //here we are telling the size of every row 0,1,2
     c2[1] = new int[2];
     c2[2] = new int[4];
     
     c2[0][0]=  1; // here we are giving the vlues of the array by specifying its index number i & j
     c2[0][1]=  2;
     c2[0][2]=  3;
     c2[1][0]=  4;
     c2[1][1]=  5;
     c2[2][0]=  6;
     c2[2][1]=  7;
     c2[2][2]=  8;
     c2[2][3]=  9;

     for(int cOne[]:c1){
    for(int cTwo:cOne){
         System.out.print(cTwo + " ");
       }
      System.out.println(); 
      
}     
     System.out.println();
   System.out.println("length VS length()");
    //length VS length()
    int a[][] = {{11,12,13},{14,15}};
    System.out.println(a.length);
    System.out.println(a[0].length);
     
    String myName = "Nikhil";
    System.out.println(myName.length());

    }
}

