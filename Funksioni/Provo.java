import java.io.*;
public  class Provo
{
 public Provo () throws FileNotFoundException,IOException
 { 
 }

 public void shkruaj (File c,String r) throws FileNotFoundException
 {
  String shkruaj ="public class Test {public  double funk(double x){return "+r+";}}";
  PrintWriter pw = new PrintWriter(c);
  pw.write(shkruaj);
  pw.close();

 }
 public void ekzekuto(String komanda) throws IOException,InterruptedException
 {
  Runtime run = Runtime.getRuntime();
  Process proc = run.exec(komanda);
  proc.waitFor();
 }

}