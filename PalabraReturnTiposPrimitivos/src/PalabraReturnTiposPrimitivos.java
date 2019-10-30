
import java.io.*;

public class PalabraReturnTiposPrimitivos {

    BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) {

        sumarSinRetornarValor(3, 4);
        int resultado = sumarRetornando(12, 23);

        System.out.println(resultado);
    }

    private static void sumarSinRetornarValor(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println(suma);
    }

    private static int sumarRetornando(int num1, int num2) {
        return num1 + num2;
    }
}
