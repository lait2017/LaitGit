package laitJava.OlaS;

import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args) {

        double a, b, c;
        System.out.println("Podaj trzy wartosci wieksze od zera");
        String text;
        Scanner Skaner = new Scanner(System.in);
        a = Skaner.nextDouble();
        b = Skaner.nextDouble();
        c = Skaner.nextDouble();
        if ((a * a) + (b * b) == (c * c))
        {
            System.out.println("Jest to trójkąt prostokątny");
        }
        else{
            System.out.println("Nie jest to trójkąt prostokątny");

        }

    }
}