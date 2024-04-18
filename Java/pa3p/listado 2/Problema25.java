class Bebida{
    public static final int VOLUMEN=500;
    private int contenido;
    private int serie;

    public int getSerie(){
        return this.serie;
    }

    public void llenar(int mls){
        if (mls > 0){
            if (contenido + mls < Bebida.VOLUMEN){
                contenido += mls;
            }
            else{
                contenido = Bebida.VOLUMEN;
            }
        }
    }

    public int beber(int tomar){
        int aux = contenido;
        if (contenido - tomar > 0){
            contenido -= tomar;
            return tomar;
        } else{
            contenido = 0;
            return aux;
        }
    }

    public Bebida(int a){
        contenido = 0;
        serie = a;
    }
}

public class Problema25 {
    public static void main(String[] args){
        Bebida b1 = new Bebida(500);
        b1.llenar(502);
        b1.getSerie();
    }
}
