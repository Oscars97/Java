
public class Persona {
  private int idPersona;
  private String nombre;
  private static int contadorPersonas;
  
  public Persona (String nombre){
      this.nombre = nombre;
      
      contadorPersonas++; //cada vez que se cree una nueva persona se va a aumentar y no se puede utilizar el this en algo static
      
      this.idPersona = contadorPersonas;
  }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
}
