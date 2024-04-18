public class Impreimpar {
    public static void main(String[] args) {
        class ComoStruct {
            int ar[] = {3, 2, 1, 5, 7, 3, -1, 10, 5};
        }

        ComoStruct arreglo = new ComoStruct();

        for (int i = 0; i < arreglo.ar.length; i++) {
            if (arreglo.ar[i] % 2 != 0) {
                if (i == arreglo.ar.length - 1) {
                    System.out.print(arreglo.ar[i]);
                } else {
                    System.out.print(arreglo.ar[i] + ",");
                }
            }
        }
    }
}
