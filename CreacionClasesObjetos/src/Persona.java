
public class Persona {
    private String Nombre;
    private String Apellidos;
    
    public Persona (String nombre, String apellidos){
        this.Nombre = nombre;
        this.Apellidos = apellidos;
    }
    public Persona (){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + '}';
    }
    
    
    
}
