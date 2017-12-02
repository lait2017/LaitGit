package laitJava;

import java.util.Scanner;

public class basia1 {

	public static void main(String[] args) {
		System.out.println("Podaj dowoln¹ liczbê wiêksz¹ od 0");	
		String text;
		Scanner odczyt = new Scanner(System.in);
		text=odczyt.nextLine();
	    int licznik = Integer.parseInt(text);
		for(int i=0; i < licznik; i++) {
			if(i%2==0) {
				System.out.println("liczba parzysta "+ i );
			}
			else {System.out.println("ta liczba nie jest parzysta " + i);}
		}
	}
	

}
