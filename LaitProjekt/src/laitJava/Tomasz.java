package laitJava;

import java.util.Scanner;

public class Tomasz {

	public static void main(String[] args) {

		cwiczeniezFarehaita();
		
		
	}

	static void cwiczeniezFarehaita() {
String zkonsoli = wczytywaniezKonsoli();
int liczba;
Integer licz = 0;
liczba = licz.parseInt(zkonsoli);
System.out.print("Stopnie Celcjusza przeliczone na Farenhaita " + (1.8 * liczba + 32.0));

	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
	}

	static void cwiczenieWczytywaniezKonsoli() {
		String text = wczytywaniezKonsoli();
		System.out.println(text);
		Integer liczbazKonsoli = 0;
		text = wczytywaniezKonsoli();
		int liczba = liczbazKonsoli.parseInt(text);
		System.out.println(liczba + 5);
	}

	// void tutaj jest po to, �e ta metoda nie b�dzie niczego zwraca�
	void mojaMetodaZmienne() {
		// TODO Auto-generated method stub
		int zmiennanr1 = 1;
		int zmiennanr2 = 3;

		System.out.println(zmiennanr1 + zmiennanr2);
		System.out.println(zmiennanr1 / zmiennanr2);
		System.out.println(zmiennanr1 * zmiennanr2);
		System.out.println(zmiennanr1 - zmiennanr2);
		System.out.println(zmiennanr1 % zmiennanr2);

		String string = "napis1";
		char z = 'z';
		double zmiennoprzecinkowa = 3.0;
		boolean prawdaFalsz = false;

		if (prawdaFalsz) {
			System.out.println("jestem w ifie" + zmiennanr1);
			zmiennanr1++;
		}

		if (true) {
			System.out.println("jestem w ifie" + zmiennanr1);
			zmiennanr1++;
		}

		if (2 == 5) {
			System.out.println("jestem w ifie" + zmiennanr1);
			zmiennanr1++;
		}

		if (2 > 5) {
			System.out.println("jestem w ifie" + zmiennanr1);
			zmiennanr1++;
		}
		if (2 < 5) {
			System.out.println("jestem w ifie" + zmiennanr1);
			zmiennanr1++;
		}
		if (2 >= 5) {
			System.out.println("jestem w ifie");
			zmiennanr1++;
		} else {
			System.out.println("jestem w elsie");
		}
		if (2 != 5) {
			System.out.println("jestem w ifie" + zmiennanr1);
			zmiennanr1++;
		}

	}

	void cwiczeniezLiczenia() {
		double a = 2.0;
		double b = 3.0;
		double c = 7.0;

		System.out.println((a + b) * c);
		System.out.println(a - b / c);

		a++;
		b++;
		c++;

		System.out.println("Czy a+b>c? " + ((a + b) > c));
		System.out.println(a == b);
	}
}
