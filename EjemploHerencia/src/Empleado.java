
public class Empleado extends Persona {
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString()+"Información de la empresa: " + "IdEmpleado=" + idEmpleado + ", Sueldo=" + sueldo + '}';
    }
    
    
}
