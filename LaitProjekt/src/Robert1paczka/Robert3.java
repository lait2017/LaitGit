package Robert1paczka;

import java.util.Scanner;

public class Robert3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisz program, kt�ry sprawdza dla trzech bok�w tr�jk�ta a,
		//b i c wprowadzonych z klawiatury, czy tworz� one tr�jk�t prostok�tny
		//(zak�adamy, �e a > 0, b > 0, c > 0).
		
	    Scanner xd = new Scanner(System.in);
	    System.out.println("Podaj wartosc boku a");
	    double x = xd.nextInt();
	    System.out.println("Podaj wartosc boku b");
	    double y = xd.nextInt();
	    System.out.println("Podaj wartosc boku c");
	    double z = xd.nextInt();
	    
	    if ((Math.pow(x, 2))+(Math.pow(y, 2)) == (Math.pow(z, 2))) {
			System.out.println("Trojkat jest prostokatny");
		} else {
			System.out.println("Trojakt nie jest prostokatny");
		}
	}

}
