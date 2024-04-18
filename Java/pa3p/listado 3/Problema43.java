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
        lista = new ArrayList<Bebida>();
    }
    
    public Deposito(int capacidad) {
        lista = new ArrayList<Bebida>(capacidad);
    }
}

class Expendedor{
    private Deposito coca;
    private Deposito sprite;

    public Expendedor(int cantidad){
        coca = new Deposito(cantidad);
        sprite = new Deposito(cantidad);

        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(i + 100));
            sprite.addBebida(new Sprite(i + 200));
        }
    }

    public Bebida comprarBebida(Moneda m, int tipoBebida) {
        Deposito deposito;
        if (tipoBebida == 1)
            deposito = coca;
        else
            deposito = sprite;

        Bebida bebida = deposito.getBebida();
        return bebida;
    }
}

class Moneda{}

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
        return super.beber() + new String("sprite");
    }
}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + new String("cocacola");
    }
}

public class Problema43 {
    public static void main(String[] args) {
        Moneda coin1 = new Moneda();
        Expendedor exp = new Expendedor(10);
        Bebida beb = exp.comprarBebida(coin1, 2);
        System.out.println(beb.getSerie() + beb.beber());
    }
}

