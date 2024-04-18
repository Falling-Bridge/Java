class Promediador {

    private int suma;
    private int cantidadNumeros;

    public Promediador() {
        this.suma = 0;
        this.cantidadNumeros = 0;
    }

    public void agregaNumero(int numero) {
        this.suma = suma + numero;
        this.cantidadNumeros++;
    }

    public float promedio() {
        return (float) this.suma / this.cantidadNumeros;
    }

    public int numero() {
        return this.cantidadNumeros;
    }
}

public class Problema14 {

    public static void main(String[] args) {
        Promediador promedio = new Promediador();
        promedio.agregaNumero(10);
        promedio.agregaNumero(20);
        promedio.agregaNumero(30);

        float promedioCalculado = promedio.promedio();
        int cantidadNumeros = promedio.numero();
        System.out.println("Promedio: " + promedioCalculado);
        System.out.println("Cantidad de numeros: " + cantidadNumeros);
    }
}
