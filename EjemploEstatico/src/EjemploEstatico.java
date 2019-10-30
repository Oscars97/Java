import java.io.*;
public class EjemploEstatico {
        public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
    
    public static void main(String[] args) throws IOException {
        
        int size;
        System.out.println("Ingrese la cantidad de personas a crear");
        size = Integer.parseInt(in.readLine());
        
        Persona personas [] = new Persona [size];
        int j =1; // la variable j nos ayuda a diferenciar los nombre de las personas creadas
        for (int i=0; i<size; i++){
            personas[i] = new Persona ("Oscar "+j); //va creando personas durante el ciclo
            System.out.println(personas[i]);
            j++;
        }
        System.out.println("\n\n\nLa cantidad de personas creadas es igual a: "+ Persona.getContadorPersonas());
    }
    
}
