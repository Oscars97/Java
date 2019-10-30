
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado ("Oscar",'m', 22, "PZ", 200000);
        System.out.println(e1.toString());
        
        Cliente c1 = new Cliente ("Steven", 'm', 22, "LA", new Date(),true);
        System.out.println(c1);
        /*
        con el new Date () creamos una nueva entrada de fecha, con la fecha y hora de este momento
        */
    }
}
