public class Arreglo {
    public static void main (String[] args){
        int R[] = {3,2,1,5,7,3,0,10,209};
        int mayor = 0;
        for (int i = 0; i < R.length; i++){
            if (R[i] > mayor){
                mayor = R[i];
            }
        }
        System.out.println(mayor);
    }
}
