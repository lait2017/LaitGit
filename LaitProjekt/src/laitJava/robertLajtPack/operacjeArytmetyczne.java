package laitJava.robertLajtPack;

import java.util.Scanner;

public class operacjeArytmetyczne {

	public static void main(String[] args) {

		System.out.println("podaj dwie zmienne");
		Scanner skaner = new Scanner(System.in);
		double x = skaner.nextDouble();
		double y = skaner.nextDouble(); 
		//potega a= liczba b= do ktorej potegi
		//double kwadrat = Math.pow(a, b);
		System.out.println("suma" + (x + y));
		System.out.println("roznica" + (x - y));
		System.out.println("iloczyn" + (x * y));
		System.out.println("iloraz" + (x / y));
		
		if(true) {
			System.out.println(" jest prostokatny");
		}else {
			System.out.println("nie jest prostokatny");
		}
	}

}
