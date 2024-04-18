class Pelota{
    private int serie;

    public int dameTuSerie(){
        return this.serie;
    }

    public Pelota(int a){
        this.serie = a;
    }
}

public class Problema20 {
    public static void main(String []args){
        Pelota p = new Pelota(5);
        int s = p.dameTuSerie();
        System.out.println(s);
    }
}
