import java.io.*;
public class Kontroller 
{
 public static void main (String [] args)
 {
  try
  {
  double i= new Double(args[0]).doubleValue();
   Test t = new Test();
  File c = new File("NdrrojEmrin.txt");
  PrintWriter p =  new PrintWriter(c);
  p.write(t.funk(i)+""); 
  p.close();
     
  }
  catch(Exception e){System.out.println(e+"sdhgsdhsdfhs");}
 }
}