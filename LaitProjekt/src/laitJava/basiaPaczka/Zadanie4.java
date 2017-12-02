package laitJava.basiaPaczka;

import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		
		System.out.println("Podaj trzy wartoœci wiêksze od zera: ");
		Scanner skaner = new Scanner(System.in);
		int a = skaner.nextInt();
		int b = skaner.nextInt();
		int c = skaner.nextInt();
		
		if((a*a)+(b*b)== (c*c)) {
			System.out.println("Jest to trójk¹t prostok¹tny");
		} 
		else { System.out.println("Nie jest to trójk¹t prostok¹tny");
		}


	}
	}