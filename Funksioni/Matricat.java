import java.io.*;
import java.util.*;
public class Matricat
{
  public static String[][] zbirtPolinomin(String a[][], String l[][]) {
        int n = a.length;
        String rez[][] = new String[n][n];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double r1 = new Double(a[i][j]).doubleValue();
                    double r2 = new Double(l[i][j]).doubleValue();
                    rez[i][j] = r1 - r2 + "";
                } else {
                    rez[i][j] = a[i][j] + "-" + l[i][j];
                }
            }
        return rez;
    }

    public static String llogDet(String a[][]) {
        String rez = "";
        int n = a.length;
        String mat[][] = new String[n][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if (j < n) {
                    mat[i][j] = a[i][j];
                } else {
                    mat[i][j] = a[i][(j % n) + 1];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            String e = "";
            int m = 0;
            if (i == 0 || i == a.length - 1) {
                for (int j = 0; j < a.length; j++) {
                    e = e + (j != 0 ? "*" : "") + "(" + mat[j][j + i] + ")";
                }
            } else {
                if (new Integer(mat[0][1]).intValue() != 0)
                    m = 1;

                for (int j = 0; j < a.length; j++) {

                    m = m * new Integer(mat[j][j + i]).intValue();
                }
            }
            rez = rez + (rez.equals("") ? "" : "+") + e + (m != 0 ? m : "");
        }
        for (int i = 0; i < a.length; i++) {
            String e = "";
            for (int j = 0; j < a.length; j++) {
                e = e + (j != 0 ? "*" : "") + "(" + mat[j][mat[0].length - 1 - j - i] + ")";
            }
            rez = rez + "-" + e;
        }
        return rez;
    }
public static String Pergjysmimi(double a, double b, double Toleranca, int num) throws FileNotFoundException {
        
        double p = 0;
        File c = new File("NdrrojEmrin.txt");
        String funksioni = Kontrolleri();
System.out.println();
        Kontroll2 k = new Kontroll2(funksioni,a);
       
        Scanner sc = new Scanner(c);
        String seee= sc.next();
        double FA  = new Double(seee).doubleValue();
        sc.close();
        
        for (int i = 1; i < num; i++) {
            p = (a + b) / 2;
            k.kompilo(p);
            sc = new Scanner(c);
           double Fp  = new Double(sc.nextLine()).doubleValue();
           sc.close();
            if((b-a)/2<Toleranca||Fp==0)
            {
                return  p+" pas " +i +" iterimeve";
            }
            if (FA*Fp> 0) {
                a = p;
                FA= Fp; }
                else {
                b = p; }
            }
            return  "Metoda deshtoj";
//        System.out.println("Metoda ka gabime");
    }

public static String Kontrolleri()
{
   String a[][] = {{"1", "1"}, {"1", "2"}};
        String l[][] = {{"x", "0"}, {"0", "x"}};
        String[][] k = zbirtPolinomin(a, l);
       /* String eee[][] = {{"1", "2", "3", "2"},
                {"2", "4", "5", "4"},
                {"2", "7", "8", "6"},
                {"5", "8", "1", "2"},
        };*/
        String mm = llogDet(k);
       // System.out.println(mm);
       return mm;
}

    public static void main(String[] args) throws FileNotFoundException{
         // System.out.println(Kontrolleri());
     
         System.out.println(Pergjysmimi(0, 5, 0.001, 20));
    }
}