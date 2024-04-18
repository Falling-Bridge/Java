public class Imprepar {
    public static void main(String[] args) {
        class ComoStruct {
            int ar[] = {3, 2, 1, 4, 7, 3, -1, 10, 5};
        }

        ComoStruct arreglo = new ComoStruct();
        boolean primero = true;

        for (int i = 0; i < arreglo.ar.length; i++) {
            if (arreglo.ar[i] % 2 == 0) {
                if (!primero) {
                    System.out.print(",");
                } else {
                    primero = false;
                }
                System.out.print(arreglo.ar[i]);
            }
        }
        System.out.println();
    }
}
