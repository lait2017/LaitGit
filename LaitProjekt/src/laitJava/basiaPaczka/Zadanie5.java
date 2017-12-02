package laitJava.basiaPaczka;

import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj trzy wartoœci: ");
		double a = skaner.nextDouble();
		double b = skaner.nextDouble();
		double c = skaner.nextDouble();
		double x = (c-b)/a;
		if (a<0) {
			System.out.println("Podaj wartoœæ wiêksz¹ ni¿ zero");
		} 
	    	else {
		System.out.println("Watoœæ x z równania ax+b=c to: " + (c-b)/a);
		}
		


	
	}
}



