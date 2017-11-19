package laitJava;

import java.util.Scanner;

public class Jacek {

	
	
	static void Farenhaita() {
		double f;
		String zkonsoli = wczytywaniezKonsoli();
		Integer licz = 0;
		int liczba = licz.parseInt(zkonsoli);
		f = (1.8 * liczba)+ 32;
		System.out.println("temperatura farenhajta" + f );
		
		
		
	}
	
	public static void main(String[] args) {
		String text = wczytywaniezKonsoli();
		System.out.println(text);
		Integer liczbaKonsoli = 0;
		text = wczytywaniezKonsoli();
		int liczba = liczbaKonsoli.parseInt(text);
		System.out.println(liczba + 5);
		}
	
	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		System.out.println(text);
		return text;
	}

	
	
	
	void mojaMetodazmienne () {
		int zmiennaInt = 1;
		int zmiennaInt2 = 3;
		System.out.println(zmiennaInt + zmiennaInt2);
		System.out.println(zmiennaInt / zmiennaInt2);
		System.out.println(zmiennaInt * zmiennaInt2);
		System.out.println(zmiennaInt - zmiennaInt2);
		System.out.println(zmiennaInt % zmiennaInt2);
		String string = "napis jakiœ";
		double zmiennoPrzecinkowa = 3.0;
		boolean prawdaFalsz = false;

		if (prawdaFalsz) {
			System.out.println("jestem w ifie" + zmiennaInt);
		}

		if (true) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}
		if (2 >= 5) {
			System.out.println("jestem w ifie");
		} else {
			System.out.println("jestem w elsie");
		}
	}
	void mojaObliczenia () {
		String napis = "napis";
		if (napis.equals("napis")) {
			System.out.println("if z napisem");

		}
		double a = 3.0, b = 4.5, c = 6.5;
		System.out.println("(a+b)*c = " + (a + b) * c);
		System.out.println("(a-b)/c = " + (a - b) / c);
		a++;
		b++;
		c++;
		if ((a + b) > c) {
			System.out.println("a+b jest wiêksze od c");
		}
		if (a == b) {
			System.out.println("a jest równe b");
		} else {
			System.out.println("a nie jest równe b");
		}
		

	}
}
