class Tubo {
    private Pelota[] balls = new Pelota[2];

    public Pelota meteA(Pelota ball) {
        if ((balls[0] == null && balls[1] == null) || (balls[0] == null && balls[1] != null)) {
            balls[0] = ball;
            return null;
        } if (balls[0] != null && balls[1] == null) {
            balls[1] = balls[0]; 
            balls[0] = ball;
            return null;
        } else{
            Pelota temp = balls[1];
            balls[1] = balls[0];
            balls[0] = ball;   
            return temp;
        }
    }

    public Pelota meteB(Pelota ball) {
        if ((balls[0] == null && balls[1] == null) || (balls[0] != null && balls[1] == null)) {
            balls[1] = ball;
            return null;
        } if (balls[0] == null && balls[1] != null) {
            balls[0] = balls[1]; 
            balls[1] = ball;
            return null;
        } else{
            Pelota temp = balls[0];
            balls[0] = balls[1];
            balls[1] = ball;   
            return temp;
        }
    }

    public void verTubo() {
        if (balls[0] != null && balls[1] != null) {
            System.out.println("A:[" + balls[0].dameTuSerie() + "," + balls[1].dameTuSerie() + "]:B");
        } else if (balls[0] == null && balls[1] != null) {
            System.out.println("A:[" + null + "," + balls[1].dameTuSerie() + "]:B");
        } else if (balls[0] != null && balls[1] == null) {
            System.out.println("A:[" + balls[0].dameTuSerie() + "," + null + "]:B");
        } else {
            System.out.println("A:[" + null + "," + null + "]:B");
        }
    }
    
    public Tubo(){
        balls[0] = null;
        balls[1] = null;
    }
}

class Pelota {
    private int serie;

    public int dameTuSerie() {
        return serie;
    }

    public Pelota(int x) {
        this.serie = x;
    }
}

public class Problema22 {
    public static void main(String[] args) {
        Pelota pelota1 = new Pelota(6);
        Pelota pelota2 = new Pelota(10);

        Tubo tubo = new Tubo();
        tubo.verTubo();

        Pelota pelotaExpulsada = tubo.meteA(pelota1);
        System.out.println("Pelota expulsada: " + (pelotaExpulsada != null ? pelotaExpulsada.dameTuSerie() : "null"));
        tubo.verTubo();

        pelotaExpulsada = tubo.meteB(pelota2);
        System.out.println("Pelota expulsada: " + (pelotaExpulsada != null ? pelotaExpulsada.dameTuSerie() : "null"));
        tubo.verTubo();
    }
}
