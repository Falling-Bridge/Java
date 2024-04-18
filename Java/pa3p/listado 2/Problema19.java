class Balde {
    private int capacidad;
    private int contenido;

    public void llenar(int litros) {
        if (litros >= 0) {
            if (this.contenido + litros <= this.capacidad) {
                this.contenido += litros;
            } else {
                this.contenido = this.capacidad;
            }
        }
    }

    public int verificar() {
        return this.contenido;
    }

    public int vaciar(int litrosvaciar) {
        if (litrosvaciar >= 0) {
            int litrosSacados = Math.min(this.contenido, litrosvaciar);
            this.contenido -= litrosSacados;
            return litrosSacados;
        }
        return 0;
    }

    public Balde(int b) {
        if (b >= 0) {
            this.capacidad = b;
            this.contenido = 0;
        }
    }
}

public class Problema19 {
    public static void main(String[] args) {
        Balde b = new Balde(13);
        b.llenar(5);
        int s = b.vaciar(6);
        System.out.println(s);
        System.out.println(b.verificar());
    }
}
