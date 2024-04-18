public class Problema24{
    public static void main(String [] args){
        CuatroOperaciones sure = new CuatroOperaciones(2, 3);
        System.out.println(sure.suma());
        System.out.println(sure.resta());
        System.out.println(sure.multiplica());
        System.out.println(sure.divide());

    }
}

class CuatroOperaciones{
    private SumaResta sr;

    public float multiplica(){
        return sr.getUno() * sr.getDos();
    }

    public float divide(){
        return sr.getUno() / sr.getDos();
    }

    public float suma(){
        return sr.suma();
    }

    public float resta(){
        return  sr.resta();
    }

    public CuatroOperaciones(float a, float b){
        this.sr = new SumaResta(a,b);
    }
}

class SumaResta{
    private float uno;
    private float dos;

    public float suma(){
        return uno + dos;
    }

    public float resta(){
        return uno - dos;
    }

    public float getUno(){
        return this.uno;
    }

    public float getDos(){
        return this.dos;
    }

    public SumaResta(float une, float dose){
        this.uno = une;
        this.dos = dose;
    }
}
