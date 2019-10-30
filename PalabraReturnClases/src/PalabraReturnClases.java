
public class PalabraReturnClases {
    
    public static void main(String[] args) {
        Suma objeto = creaObjetoSuma();
        System.out.println(objeto.Sumar());
    }
    
    /*
    El siguiente metodo retorna una referencia del objeto creado
    */
    private static Suma creaObjetoSuma(){
        return new Suma (1,2);
    }
  
}

class Suma {
    private int num1;
    private int num2;
    
    public Suma (int a, int b){
        this.num1 = a;
        this.num2 = b;
    }
    public int Sumar (){
        return num1+num2;
    }
    
}
