class Expendedor {
    public Bebida comprarBebida(Moneda moneda) {
        return new Bebida();
    }

    public Expendedor() {}
}

class Bebida {
    public String beber() {
        return "gluglu";
    }

    public Bebida() {}
}

class Moneda {
    public Moneda() {}
}

public class Problema27 {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor();
        System.out.println(exp.comprarBebida(new Moneda()).beber());
    }
}