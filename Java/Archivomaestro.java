package Java;

import java.util.Scanner;
import Java.elefantesrosados.Calculadora;
import Java.elefantesrosados.Fibbonaci;

public class Archivomaestro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String programa = scan.nextLine();
        if (programa.equals("Calc")) {

            String funcion = scan.nextLine();
            double a = scan.nextDouble();
            double b = scan.nextDouble();

            Calculadora calc = new Calculadora();

            if (funcion.equals("Suma"))
                System.out.println(calc.Suma(a, b));
            if (funcion.equals("Resta"))
                System.out.println(calc.Resta(a, b));
            if (funcion.equals("Div"))
                System.out.println(calc.Div(a, b));
            if (funcion.equals("Mult"))
                System.out.println(calc.Mult(a, b));
            if (funcion.equals("Pow"));
                System.out.println(calc.Pow(a, b));
            scan.close();
        }
        if (programa.equals("Fibb")){
            int a = scan.nextInt();
            Fibbonaci Fibb = new Fibbonaci();
            System.out.println(Fibb.fibb(a));
        }
        if (programa.equals("Test")){
            Test prueba = new 
        }
    }
}
