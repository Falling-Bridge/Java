import java.util.ArrayList;

class Expendedor {

    private Deposito depo;

    public Bebida comprarBebida(Moneda moneda) {
        return depo.getBebida();
    }

    public Expendedor(int a) {
        depo = new Deposito(a);
        for (int i = 0; i < a; i++){
            depo.addBebida(new Bebida(i));
        }
    }
}

class Bebida {

    private int serie;

    public String beber() {
        return new String("gluglu");
    }

    public int getSerie() {
        return serie;
    }

    public Bebida(int a) {
        this.serie = a;
    }
}

class Deposito {
    private ArrayList<Bebida> lista;

    public void addBebida(Bebida x) {
        lista.add(x);
    }

    public Bebida getBebida() {
        if (lista.size() == 0) {
            return null;
        } else {
            Bebida aux = lista.get(0);
            lista.remove(0);
            return aux;
        }
    }
    
    public Deposito(int a) {
        lista = new ArrayList<>(a);
    }
}

class Moneda {

}

public class Problema28 {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Moneda coin1 = new Moneda();
        Moneda coin2 = new Moneda();
        System.out.println(exp.comprarBebida(coin1).beber());
        System.out.println(exp.comprarBebida(coin2).beber());
    }
}