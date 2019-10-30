
import java.io.*;


public class PasoPorValor {
    
    public static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
    public static PrintStream out = System.out;
    
    /*
    paso por valor
    */
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        
        cambiarValor(x);
        System.out.println(x);
    }
    
    public static void cambiarValor(int x){
        x = 20;
        System.out.println("x = "+x);
    }
}
