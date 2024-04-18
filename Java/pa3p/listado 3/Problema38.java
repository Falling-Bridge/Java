class SumaResta{
    protected float uno, dos;

    public float suma(){
        return uno + dos;
    }

    public float resta(){
        return uno - dos;
    }

    public SumaResta(float a, float b){
        uno = a;
        dos = b;
    }
}

class CuatroOperaciones extends SumaResta{

    public float multiplica(){
        return uno * dos;
    }

    public float divide(){
        return uno / dos;
    }

    public CuatroOperaciones(float a, float b){
        super(a,b);
    }
}

public class Problema38 {
    public static void main(String [] args){
        CuatroOperaciones op = new CuatroOperaciones(45,67);
        System.out.println(op.resta());
        System.out.println(op.suma());
        System.out.println(op.divide());
        System.out.println(op.multiplica());

    }
}
