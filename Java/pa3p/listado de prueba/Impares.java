public class Impares{
    public static void main(String[] args){
        int k= 0;
        for (int i = 1; i <101; i++) {
            k = k + 2*i -1;
        }
        System.out.println("La suma es: " + k);
    }
}