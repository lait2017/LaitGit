package laitJava.OlaS;

import java.util.Scanner;

public class zadanie5 {

    public static void main(String[] args) {


        double a, x, b,c ;
        Scanner Skaner = new Scanner(System.in);
        a = Skaner.nextDouble();
        System.out.println("Podaj trzy liczby rzeczywiste");
        if (a<0)
        {
            System.out.println("Wartosci mniejsze od zera");
        }
            else {

        String text;

         c = Skaner.nextDouble();
         b = Skaner.nextDouble();
         x = (c-b)/a;
        System.out.println("wartosc x z rownania ax+b=c" + (c-b)/a);


    }
}
}