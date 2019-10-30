package primeros_pasos;

import java.io.*;


public class calculosMath { //clase math

    public static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
    public static PrintStream out = System.out;    // variables objetos in y out para

    public static void main(String[] args) throws IOException {
        //vamos a utilizar él sqrt
        double numero1 = 0;
        float numero2 = 0;
        int base = 0;
        int exponente = 0;
        
        out.println("Ingrese un número para raíz cuadrada"); 
        numero1 = Double.parseDouble(in.readLine());
        
        out.println("Ingrese un número para redondear");
        numero2 = Float.parseFloat(in.readLine());
        
        out.println("Ingrese un número como base para potencia");
        base = Integer.parseInt(in.readLine());
        out.println("Ingrese un número como exponente para la potencia");
        exponente = Integer.parseInt(in.readLine());
        
        int redondeado = Math.round(numero2); // para redondear
        double sqrt = Math.sqrt(numero1); // para raìz cuadrada
        
        int potencia = (int) Math.pow(base, exponente); // para elevar un numero
        out.println("El resultado de la raíz cuadrada de: "+numero1+ " es: "+sqrt+ "\nY el resultado al redondear el número "+numero2+
                " es: "+redondeado+ "\nY al elevar "+base+" a la "+exponente+ " tenemos como resultado: "+potencia);
        
        
        

    }

}
