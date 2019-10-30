
public class PruebaPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona ("Juan", 5000, false);
        
        Persona p2 = new Persona ("Oscar", 10000, true);
        boolean estado = p1.isEliminado();
        boolean estado2 = p2.isEliminado();
        
        if(estado!=false || estado2!=false){
            System.out.println(p1);
            System.out.println(p2);
        }
        else{
            System.out.println("La persona no existe en el sistema");
        }
                
    }
}
