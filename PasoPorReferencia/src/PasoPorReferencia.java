
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona p1 = new Persona ();
        
        p1.modificarNombre("Oscar");
        System.out.println(p1.obtenerNombre());
        
        modificarPersona(p1);
       
        System.out.println(p1.obtenerNombre());
    }

    private static void modificarPersona(Persona arg) {
        arg.modificarNombre("Steven");
    }
}
