class OtraClase{
    private int loto;

    public int sacaDato(){
        return this.loto;
    }

    public OtraClase(int entero){
        this.loto = entero;
    }
}

public class Problema11 {
    public static void main(String [] args){
        OtraClase otra = new OtraClase(1234567890);
        System.out.println(otra.sacaDato());
    }
}
