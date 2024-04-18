public class Invertido {
    public static void main (String [] args){
        int R[]={1,2,3,4,5,6,7,8,9,10};
        int momentaneo = 0;

        for (int i = 0; i <= R.length; i++){
            momentaneo = R[i];
            R[i] = R[R.length - i - 1];
            R[R.length - i - 1] = momentaneo;
        }
    }

}
