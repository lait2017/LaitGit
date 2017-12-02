package Jacekpaczka;
import java.util.Scanner;

public class operacjeArtmetyczne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		double x,y;
	System.out.println("podaj dwie zmienne");
		Scanner skaner = new Scanner(System.in);
		x = skaner.nextDouble();
		y = skaner.nextDouble();
		
		System.out.println("suma" + (x+y));
		System.out.println("roznica" + (x-y));
		System.out.println("iloczyn" + (x*y));
		System.out.println("iloraz" + (x/y));
*/
		double a,b,c;
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj dwa boki trojkata");
		a = skaner.nextDouble();
		b = skaner.nextDouble();
		c = skaner.nextDouble();

		if ((a*a)+(b*b)==(c*c)) {
			System.out.println("jest prostokatny");
		}else {
			System.out.println("nie jest prostokatny");
		}
		}
	}

