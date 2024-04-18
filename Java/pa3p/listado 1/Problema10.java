class Bebida {
    
    public Bebida() {
 
    }

    public String beber() {
        return new String("gluglu");
    }
}

public class Problema10 {
    public static void main(String[] args) {
        Bebida var = new Bebida();
        System.out.println(var.beber());

    }
}
