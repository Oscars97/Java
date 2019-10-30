
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Main {
    
    public static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
    
    public static PrintStream out = System.out;
    
    
    public static void main(String[] args) throws IOException {
        
        int continuar;
        do{
        out.print(infoPersonas());
        out.print("\n**************************************\n*****************************\n");
        out.print(datos());
        out.println("Desea continuar?\n1-Sí\n2-No");
        continuar = Integer.parseInt(in.readLine());
        }while(continuar==1);
        
    }
    
    public static String infoPersonas (){
        Persona p1 = new Persona (); //CON ESTO PODEMOS CREAR UNA PERSONA con constructor vacio
        p1.setNombre("Oscar"); //Con esto modificamos el nombre 
        p1.setApellidos("Sanchez Meza"); //con esto modificiamos los apellidos
        
        
        Persona p2 = new Persona ("Carlos","Sánchez Meza"); //con esto utilizamos el constructor con parametros
        return p1.toString()+"\n"+p2.toString();
    }
    
    public static String datos () throws IOException{
        String info = "";
        out.println("Ingrese un numero seguido de la tecla enter");
        int numero1 = Integer.parseInt(in.readLine());
        
        out.println("Ingrese un numero seguido de la tecla enter");
        int numero2 = Integer.parseInt(in.readLine());
        
        Operaciones operacion = new Operaciones(numero1, numero2);
        
        info = "La suma es: "+operacion.sumar()+"\nLa resta es: "+operacion.restar()+"\nLa multiplicacion es: "+
                operacion.multiplicar()+"\n\n\n\n";
        return info;
    }
}
