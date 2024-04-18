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
    public Sprite(int a){
        super(a);
    }

    public String beber(){
        return new String("sprite");
    }
}

class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }

    public String beber(){
        return new String("fanta");
    }
}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }

    public String beber(){
        return new String("cocacola");
    }
}

class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }

    public String beber(){
        return new String("kem");
    }
}

public class Problema40{
    class CreaYPruebaBebida {
        public static void main(int que, int serie){
            Bebida b=null;
            switch (que){
                case 1:  b = new Sprite(serie); break;
                case 2:  b = new Fanta(serie); break;
                case 3:  b = new Kem(serie); break;
                case 4:  b = new CocaCola(serie); break;
                default: return;
            }
            System.out.println(b.getSerie()+": "+b.beber());  
        }
  }
}