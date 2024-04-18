class SumaResta{
    private float uno, dos;

    public float suma(){
        return this.uno + this.dos;
    }

    public float resta(){
        return uno - this.dos;
    }

    public float getUno(){
        return uno;
    }

    public float getDos(){
        return dos;
    }

    public SumaResta(float a, float b){
        uno = a;
        dos = b;
    }
}

class CuatroOperaciones extends SumaResta{

    public float multiplica(){
        return getUno() * getDos();
    }

    public float divide(){
        return getUno() / getDos();
    }

    public CuatroOperaciones(float a, float b){
        super(a,b);
    }
}

public class Problema39 {
    public static void main(String [] args){
        CuatroOperaciones op = new CuatroOperaciones(45,67);
        System.out.println(op.resta());
        System.out.println(op.suma());
        System.out.println(op.divide());
        System.out.println(op.multiplica());
        System.out.println(op.getUno());
        System.out.println(op.getDos());
        
    }
}
