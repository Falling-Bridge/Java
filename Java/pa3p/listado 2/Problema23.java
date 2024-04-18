class SumaResta{
    private float uno;
    private float dos;

    public float suma(){
        return uno + dos;
    }

    public float resta(){
        return uno - dos;
    }

    public SumaResta(float a, float b){
        this.uno = a;
        this.dos = b;
    }
}

public class Problema23 {
    public static void main (String [] args){
        SumaResta sr = new SumaResta(1,12);
        System.out.println(sr.suma());
        System.out.println(sr.resta());
    }
}
