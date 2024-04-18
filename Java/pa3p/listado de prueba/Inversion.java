public class Inversion {
    static int R[] = {3, 2, 1, 5, 7, 3, 0, 10, 5};
    
    public static void main(String[] args) {
        
        for (int i = 0; i < R.length / 2; i++){
            int salvar = R[i];
            R[i] = R[R.length - i - 1];
            R[R.length - i - 1] = salvar;
        }
        
        for (int i = 0; i < R.length; i++){
            if (i == R.length - 1){
                System.out.println(R[i]);
            } else{
                System.out.print(R[i] + ",");
            }         
        }
    }
}
