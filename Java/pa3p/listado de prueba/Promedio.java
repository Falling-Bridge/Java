public class Promedio {
    public static void main (String [] args){
        int b[]={1,2,3,4,5};
        float suma = 0;

        for (int i = 0; i < b.length; i++){
            suma = suma + b[i];
        }
        System.out.println(suma/b.length);
    }
}
