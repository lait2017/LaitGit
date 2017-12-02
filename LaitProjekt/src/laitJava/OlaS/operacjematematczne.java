package laitJava.OlaS;

import java.util.Scanner;

public class operacjematematczne {

    public static void main(String[] args) {


        double x, y ;

        String text;
        Scanner Skaner = new Scanner(System.in);
        x = Skaner.nextDouble();
        y = Skaner.nextDouble();
        System.out.println("suma" + (x+y));
        System.out.println("różnica" + (x-y));
        System.out.println("iloczyn" + (x*y));
        System.out.println("iloraz" + (x/y));



    }

}