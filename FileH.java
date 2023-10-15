
import java.util.*;
import java.io.*;

public class FileH 
{
    public static void main(String[] args) throws IOException

{

  File f1 = new File("Pw12");
  // f1.mkdir();
 
  File f2 = new File(f1,"File1.txt");
  // f2.createNewFile();
 
  FileWriter fw = new FileWriter(f2);
  // fw.write(19);
  // fw.write("\n");
  // fw.write("i am  nikhil");
  // fw.close();
  FileReader fr = new FileReader(f2);
  // char[] c = new char[(char)f2.length()];     
  // fr.read(c);
  // for(char data : c)
  // {
  //   System.out.println(data);
  // }
 

  BufferedWriter bw = new BufferedWriter(fw);
  bw.write("I AM Nikhil");
  bw.newLine();
  char[] ch = {'N','I','K','H','I','L'};
bw.write(ch);
bw.close();
BufferedReader br = new BufferedReader(fr);
char[] chh = new char[(char)f2.length()];
br.read(chh);
for(char data1 : chh )
{
 System.out.print(data1);
}


}   
}

