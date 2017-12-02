package tomeklaitpackage;

import java.util.Scanner;

public class operacjeArytmetyczne {

    public static void main(String[] args) {


        // System.out.println("Podaj dwie zmienne");

        // Scanner skaner = new Scanner(System.in);
        //double x  = skaner.nextDouble();
        //double y = skaner.nextDouble();


        //System.out.println("Suma to " + (x + y));
        //System.out.println("Różnica to " + (x - y));
        //System.out.println("Iloczyn to " + (x*y));
        //System.out.println("Iloraz to " + (x/y));

        // System.out.println("Podaj boki trojkata ");
        //Scanner skaner = new Scanner(System.in);
        //double a = skaner.nextDouble();
        //double b = skaner.nextDouble();
        //double c = skaner.nextDouble();
        //double kwadrat = Math.pow(x, y); x to jest liczba do podniesienia, y jest to potęga do której się podnosi.
        //if ((a * a) + (b * b) == (c * c)) {
        //    System.out.println("Ten trojkat jest prostokatny");
        //} else {
        //  System.out.println("Ten trojkat nie jest prostokaty");

        //}
       /* System.out.println("Podaj zmienne a, b oraz c ");
        Scanner skaner = new Scanner(System.in);
        double a = skaner.nextDouble();
        double b = skaner.nextDouble();
        double c = skaner.nextDouble();
        double x = (c - b) / a;
        System.out.println("Wartość x to " + x);
        if (a == 0) {
            System.out.println("Wprowadzana pierwsza wartosc musi byc wieksza od 0. ");
        } else {
            System.out.println("Wynik równania to " + c);
        }
        */
        /*
        System.out.println("Podaj zmienna x ");


        double x;
       double y;

        for (x = 0; x<11; x++){
            y = 3*x;
            System.out.println("Wynik działania y = 3x to " + y);
        }
*/

      /* int a = 0 ;

        while (a < 11) {
            System.out.println("y to " + a + ". Wynik działania y=3x to " + a*3);
            a++;
    }
*/

        double a;
        a = 11;
        do {
            System.out.println("Do while.");
        }
        while (a < 10);
        a++;
    }
}