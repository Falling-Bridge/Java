package Java.elefantesrosados;

public class Fibbonaci {
    public int fibb(int a) {
        int numeroanterior = 0;
        int siguientenumero = 1;
        int arreglo[];
        for (int i = 1; i  <= a; i++){
            System.out.print(numeroanterior + ", ");
            int sum = numeroanterior + siguientenumero;
            numeroanterior = siguientenumero;
            siguientenumero = sum;
            arreglo[i-1] = numeroanterior;
        }
    } 
    return arreglo;

    
}
