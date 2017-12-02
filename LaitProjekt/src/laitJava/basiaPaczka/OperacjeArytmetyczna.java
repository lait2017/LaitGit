package laitJava.basiaPaczka;

import java.util.Scanner;

public class OperacjeArytmetyczna {

	public static void main(String[] args) {
	
	
		System.out.println("podaj dwie zmienne: ");
		Scanner skaner = new Scanner(System.in);
		double x = skaner.nextDouble();
		double y= skaner.nextDouble();
		System.out.println("suma: "+ (x+y)) ;
		System.out.println("roznica: "+ (x-y));
		System.out.println("iloczyn:"+ (x*y));
		System.out.println("iloraz:"+ (x/y));
		
		
		

	}

}
