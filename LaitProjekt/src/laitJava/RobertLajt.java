package laitJava;

import java.util.Scanner;

import com.sun.java.swing.plaf.motif.resources.motif_ja;

public class RobertLajt {

	public static void main(String[] args) {

		// czwiczeniezWcytywania();
cwieczeniezFarehaita();
	}

	static void cwiczenie3Liczby(){
		
		int a = Integer.parseInt(wczytywaniezKonsoli());
		int b = Integer.parseInt(wczytywaniezKonsoli());
		int c = Integer.parseInt(wczytywaniezKonsoli());
		int largest;
		int smallest;
		if (a > b) { 
			largest = a;
		} else {
			largest = b;
		}
 
		if (c > largest) { 
			largest = c;
		}
 
		System.out.println("Najwiêksza: " + largest);
 
		if (a < b) {
			smallest = a;
		} else {
			smallest = b;
		}
 
		if (c < smallest) {
			smallest = c;
		}
	
	}
	
	static void cwieczeniezFarehaita() {
		/*
		 * Napisaæ program s³u¿¹cy do konwersji wartoœci temperatury podanej w stopniach
		 * Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
		 * Celsjusza + 32.0)
		 */
		
		
		String zkonsoli = wczytywaniezKonsoli();
		int liczba;
		Integer liczbaDokonwersji =0;
		liczba = liczbaDokonwersji.parseInt(zkonsoli);
		double farenhite = 1.8 *liczba +32;
		System.out.println(zkonsoli +" celcisusza to farenhaita "+ farenhite );
		System.out.println(zkonsoli + " stopni celciu" +  "sza to "
				+( 1.8 * Integer.parseInt(zkonsoli) + 32) +" stopni farenhaita");
	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
	}

	static void czwiczeniezWcytywania() {
		String text = wczytywaniezKonsoli();
		System.out.println(text);
		Integer liczbazKonsoli = 0;
		text = wczytywaniezKonsoli();
		int liczba = liczbazKonsoli.parseInt(text);
		System.out.println(liczba + 5);
	}

	static void mojaMetodaZmienne() {
		int zmiennaInt = 1;
		int zmiennaInt2 = 3;
		System.out.println(zmiennaInt);
		System.out.println(zmiennaInt + zmiennaInt2);
		System.out.println(zmiennaInt / zmiennaInt2);
		System.out.println(zmiennaInt * zmiennaInt2);
		System.out.println(zmiennaInt - zmiennaInt2);
		System.out.println(zmiennaInt % zmiennaInt2);

		String string = "napis 123";
		char d = 'a';
		double ziennoPrzecinkowa = 3.0;

		boolean prawdaFalsz = false;

		if (prawdaFalsz) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (true) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}
		if (2 == 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (2 < 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (2 > 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (2 >= 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (2 != 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}
		if (2 >= 5) {
			System.out.println("jestem w ifie");
		} else {
			System.out.println("jestem w elsie");
		}
		String napis = "napis";
		if (napis.equals("napis")) {
			System.out.println("jestem w ifie z napisem");
		}
	}

	static void cwiczeniezLiczenia() {
		// 1.3 Napisz prosty kalkulator,
		// w którym bêdziesz przechowywa³ 3 zmienne typu double o nazwach a,b,c.
		// (a+b)*c
		// a-b/c
		/**
		 * u¿yj operatorów inkrementacji i zwiêksz wszystkie zmienne o 1. Teraz porównaj
		 * ze sob¹, czy: (a+b)>c czy a=b? Przedstaw wyniki w konsoli.
		 * 
		 */

		double a, b, c;
		a = 1.0;
		b = 2.0;
		c = 3.0;
		System.out.println("(a+b)*c= " + ((a + b) * c));
		System.out.println("a-b/c= " + (a - b / c));

		a++;
		b++;
		c++;

		System.out.println("Czy a+b>c? " + ((a + b) > c));
		System.out.println("Czy a=b? " + (a == b));

	}
}
