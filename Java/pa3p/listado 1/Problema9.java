class PrimeraClase{
    private String str;

    public String getString(){
        return str;
    }

    public PrimeraClase(String hola){
        this.str = hola;
    }

}

public class Problema9 {
    public static void main(String [] args){
        PrimeraClase primer = new PrimeraClase("hello");
        System.out.println(primer.getString());
    }
}
