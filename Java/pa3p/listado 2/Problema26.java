import java.util.ArrayList;

class Bebida {
    private int serie;

    public int getSerie() {
        return this.serie;
    }

    public void beber() {
    }

    public Bebida(int a) {
        this.serie = a;
    }
}

class Deposito {
    private ArrayList<Bebida> lista;

    public Deposito() {
        lista = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida x) {
        lista.add(x);
    }

    public Bebida getBebida() {
        if (!lista.isEmpty()) {
            Bebida aux = lista.get(0);
            lista.remove(0);
            return aux;
        }
        return null;
    }
}

public class Problema26 {
    public static void main(String[] args) {
        Deposito depo = new Deposito();

        depo.addBebida(new Bebida(6));
        depo.addBebida(new Bebida(4));
        Bebida bebida1 = depo.getBebida();
        if (bebida1 != null) {
            System.out.println(bebida1.getSerie());
        } else {
            System.out.println("El deposito esta vacio");
        }
        Bebida bebida2 = depo.getBebida();
        if (bebida2 != null) {
            System.out.println(bebida2.getSerie());
        } else {
            System.out.println("El deposito esta vacio");
        }
        Bebida bebida3 = depo.getBebida();
        if (bebida3 != null) {
            System.out.println(bebida3.getSerie());
        } else {
            System.out.println("El deposito esta vacio");
        }
    }
}
