
package Main;
import java.io.*;
public class CajaLab1 {
     
    public static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));

    public static PrintStream out = System.out;
    
    public static void main(String[] args) throws IOException {
        out.println("Ingrese el ancho");
        double ancho = Double.parseDouble(in.readLine());
        out.println("Ingrese la profundidad");
        double profundo = Double.parseDouble(in.readLine());
        out.println("Ingrese el alto");
        double alto = Double.parseDouble(in.readLine());
        Caja box = new Caja (ancho,profundo, alto);
        
        out.println(box.Total());
    }
    
}
