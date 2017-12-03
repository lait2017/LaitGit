package laitJava;

import java.util.Scanner;

public class Ola {

	private static char[] j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i++;

		}

		System.out.println("teraz for");
		for (int j = 0; j < 10; j++)			
		{
			System.out.println(j);

		}

		i = 0;
		do {

			System.out.println("teraz do while");
			i++;
		} while (i < 10);

		String text = wczytywaniezKonsoli();
		{
			System.out.println(text);
			Integer liczbazKonsoli = 0;
			text = wczytywaniezKonsoli();
			int liczba = liczbazKonsoli.parseInt(text);
			System.out.println(liczba + 5);

		}

		for (int i1 = 0; i1 < 10; i1++) {
			System.out.println(" i = " + i1);

		}
		
		for (int j = 0; j < 10; j++)			
		{
			cwiczeniezFarenhaita();
		}
	}

	static void cwiczeniezFarenhaita() {

		String zkonsoli = wczytywaniezKonsoli();
		int liczba;
		Integer licz = 0;
		liczba = licz.parseInt(zkonsoli);
		int liczba2 = Integer.parseInt(wczytywaniezKonsoli());

		Integer liczbaDokonwersji = 0;
		liczba = liczbaDokonwersji.parseInt(zkonsoli);
		double farenhite = 1.8 * liczba + 32;
		System.out.println(zkonsoli + " celcjusza to farenheita" + farenhite);

	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;

	}

	void mojaMetodaZmienne() {
		int zmiennaInt = 1;
		int zmiennaInt2 = 3;
		System.out.println(zmiennaInt + zmiennaInt2);
		System.out.println(zmiennaInt / zmiennaInt2);
		System.out.println(zmiennaInt * zmiennaInt2);
		System.out.println(zmiennaInt - zmiennaInt2);
		System.out.println(zmiennaInt % zmiennaInt2);
		String string = "napis 123";
		char a = 'a';
		double zmiennaPrzecinkowa = 3.0;
		boolean prawdaFalsz = false;




		if (prawdaFalsz) {
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

		if (2 <= 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (2 != 5) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++; // logiczna negacja, r�ne

			double d, b, c;
			d = 5;
			b = 10;
			c = 15;
			System.out.println((d + b) * c);
			System.out.println((d - b) / c);

			d++;
			b++;
			c++;

			System.out.println((d + b) > c);
			System.out.println((d == b));

		}

	}

	static void cwiczenie3Liczby() {

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

		System.out.println("Najwi�ksza: " + largest);

		if (a < b) {
			smallest = a;
		} else {
			smallest = b;
		}

		if (c < smallest) {
			smallest = c;

		}

	}

}
