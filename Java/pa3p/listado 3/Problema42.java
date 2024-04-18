import java.util.ArrayList;

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

    public Deposito(){
        lista = new ArrayList<>();
    }
    
    public Deposito(int capacidad) {
        lista = new ArrayList<>(capacidad);
    }
}

abstract class Bebida{
    private int serie;

    public int getSerie(){
        return serie;
    }

    public String beber(){
        return new String("sabor: ");
    }

    public Bebida(int a){
        serie = a;
    }
}

class Sprite extends Bebida{
    public Sprite(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "sprite";
    }
}

class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "fanta";
    }
}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "cocacola";
    }
}

class Kem extends Bebida{

    public Kem(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "kem";
    }
}

public class Problema42 {
    public static void main(String[] args) {
        Deposito depo1 = new Deposito();
        Deposito depo2 = new Deposito(10);
        depo1.addBebida(new Kem(3));
        depo1.addBebida(new Fanta(4));
        depo1.addBebida(new Sprite(5));
        depo2.addBebida(new CocaCola(6));
        depo2.addBebida(new Kem(7));
        depo2.addBebida(new Fanta(8));

        for (int i = 0; i < 3; i++) {
            Bebida bebida1 = depo1.getBebida();
            Bebida bebida2 = depo2.getBebida();
            if (bebida1 != null) {
                System.out.println(bebida1.beber());
            }
            if (bebida2 != null) {
                System.out.println(bebida2.beber());
            }
        }
    }
}