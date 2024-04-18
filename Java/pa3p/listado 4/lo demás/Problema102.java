
abstract class Moneda{

    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();

    public Moneda(){

    }
}

class Moneda1500 extends Moneda{

    public int getValor(){
        return 1500;
    }

    public Moneda1500(){
        super();
    }
}

class Moneda1000 extends Moneda{

    public int getValor(){
        return 1000;
    }

    public Moneda1000(){
        super();
    }
}

class Moneda500 extends Moneda{

    public int getValor(){
        return 500;
    }

    public Moneda500(){
        super();
    }
}

class Moneda100 extends Moneda{

    public int getValor(){
        return 100;
    }

    public Moneda100(){
        super();
    }
}

class Comprador{

    public void cuantoVuelto(){
        
    }

    public void queBebiste(){

    }

    public Comprador(){

    }
}

class Deposito{

}

class Expendedor{

    public static final int  COCA=1;
    public static final int  SPRITE=2;
    
    public void getVuelto(int drink, int money){ 
    }

    public void comprarBebida(){

    }

    public Expendedor(){
        
    }

}

abstract class Bebida{
    private int serie;

    public int getSerie(){
        return serie;
    }

    public abstract String beber();

    public Bebida(int a){
        serie = a;
    }
}

class Sprite extends Bebida{
    public Sprite(int ab){
        super(ab);
    }

    public String beber(){
       return new String("sprite");
    }
}

class CocaCola extends Bebida{
    public CocaCola(int ac){
        super(ac);
    }

    public String beber(){
        return new String("cocacola");
    }
}

public class Problema102 {
    public static void main(String [] args){
        Sprite sp = new Sprite(1);
        CocaCola cc = new CocaCola(2);
        System.out.println(sp.getSerie());
        System.out.println(cc.getSerie());
    }
}

