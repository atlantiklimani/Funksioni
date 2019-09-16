import java.util.*;
import java.io.*;
public class Provuese{
 public static void main (String [] args)
 {
  Kontroll2 k = new Kontroll2("x*x*x +1",2);
  //k.kompilo(6);
 
  try
  {
   Scanner sc = new Scanner(new File("NdrrojEmrin.txt"));
   System.out.println(sc.next());
   sc.close();
  }
  catch(Exception e){}

}
}