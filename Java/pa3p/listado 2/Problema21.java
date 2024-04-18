class EnvaseCarton{

    private Pelota pel;

    public Pelota metePelota(Pelota b){
        if(pel == null){
            pel = b;
            return null;
        }
        else{
            return b;
        }
    }

    public Pelota damePelota(){
        Pelota aux = pel;
        pel = null;
        return aux;
    }

    public EnvaseCarton(){
        this.pel = null;
    }
}


class Pelota{
    private int serie;

    public int dameTuSerie(){
        return this.serie;
    }

    public Pelota(int a){
        this.serie = a;
    }
}

public class Problema21 {
    public static void main(String[]args){
        EnvaseCarton ec = new EnvaseCarton();   
        Pelota p1 = new Pelota(5);             
        Pelota r1 = ec.metePelota(p1);        
        if(p1 == r1)System.out.println("NO entro"+": "+p1.dameTuSerie());
        else System.out.println("SI entro"+": "+p1.dameTuSerie());  
        Pelota p2=new Pelota(6);           
        Pelota r2 = ec.metePelota(p2);                    
        if(p2==r2)System.out.println("NO entro"+": "+p2.dameTuSerie()); 
        else System.out.println("SI entro"+": "+p2.dameTuSerie());   
        
        Pelota saca1 = ec.damePelota();                
        if(saca1!=null)System.out.println(saca1.dameTuSerie());
        else System.out.println(saca1);                      
        Pelota saca2 = ec.damePelota();                       
        if(saca2!=null)System.out.println(saca2.dameTuSerie());
        else System.out.println(saca2);                        
  }
}
