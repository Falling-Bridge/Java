public class Rotacion {
    public static void main(String[] args) {
        class ComoStruct {
            int ar[] = { 3, 2, 1, 5, 7, 3, 1000, 10, 5 };
        }

        ComoStruct arreglo = new ComoStruct();

        int salvar = arreglo.ar[0];

        for (int i = 0; i < arreglo.ar.length - 1; i++) {
            arreglo.ar[i] = arreglo.ar[i + 1];
        }

        arreglo.ar[arreglo.ar.length - 1] = salvar; 

        for (int i = 0; i < arreglo.ar.length; i++) {
            if (i == arreglo.ar.length - 1) {
                System.out.println(arreglo.ar[i]);
            } else {
                System.out.print(arreglo.ar[i] + ",");
            }
        }
    }
}
