class Persona {

    private String nombrePersona;
    private boolean estadoCivil;

    public Persona(String nombrePersona, boolean estadoCivil) {
        this.nombrePersona = nombrePersona;
        this.estadoCivil = estadoCivil;
    }

    public boolean esCasado() {
        return this.estadoCivil;
    }

    public String elNombre() {
        return this.nombrePersona;
    }
}

public class Problema12 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", true);

        boolean casadoPersona1 = persona1.esCasado();
        System.out.println("Persona 1 casada: " + casadoPersona1);
    }
}
