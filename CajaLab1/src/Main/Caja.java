
package Main;


public class Caja {
    private double ancho;
    private double profundo;
    private double alto;
    
    public Caja(){
        
    }
    public Caja(double ancho, double profundo, double alto){
        this.ancho= ancho;
        this.profundo = profundo;
        this.alto = alto;
    }
    public double Total (){
        return this.ancho*this.profundo*this.alto;
    }
}
