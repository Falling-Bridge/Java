class Bebida{
    private boolean llena;

    public Bebida(boolean a){
        llena = a;
    }
    public String beber(){
            return new String("gluglu");       
    }
}

public class Problema13 {
    public static void main (String [] args){
        Bebida bebida = new Bebida(true);
        System.out.println(bebida.beber());

    }
}
