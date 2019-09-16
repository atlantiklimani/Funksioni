import java.io.*;
public class Kontroll2 
{
public static String f;
public static int i;
public Kontroll2(String f,double i)
{
  try
  {
   Provo p = new Provo();
   
   File c=  new File("Test.java");
   p.shkruaj(c,f);
   
   p.ekzekuto("C:\\Program Files (x86)\\Java\\jdk-12.0.1\\bin\\javac.exe  Test.java");
   //p.ekzekuto("C:\\Program Files\\Java\\jdk-9.0.1\\bin\\javac.exe  Test.java ");

   String komanda =  "C:\\Program Files (x86)\\Java\\jdk-12.0.1\\bin\\java.exe  Kontroller "+i;
 
   p.ekzekuto("C:\\Program Files (x86)\\Java\\jdk-12.0.1\\bin\\javac.exe  Kontroller.java");
   p.ekzekuto(komanda);
   //p.ekzekuto("C:\\Program Files\\Java\\jdk-9.0.1\\bin\\javac.exe  Kontroller.java");
   //p.ekzekuto(komanda);
  }
  catch(Exception e)
  {
  
  }}
  public void kompilo(double i)
  {
  try
  {
  
  Provo p = new Provo();
  String komanda =  "C:\\Program Files (x86)\\Java\\jdk-12.0.1\\bin\\java.exe  Kontroller "+i;
  p.ekzekuto(komanda);
  }
  catch(Exception e)
  {
  System.out.println(e);
  }
}
}