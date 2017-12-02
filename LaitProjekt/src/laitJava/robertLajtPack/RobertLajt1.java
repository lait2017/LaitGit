package laitJava.robertLajtPack;

import java.util.Scanner;

public class RobertLajt1 {

	public static void main(String[] args) {
		System.out.println("wprowadz liczbe dodatnia");
		String text;
		Scanner odczyt = new Scanner(System.in);
		double dub = Double.parseDouble(odczyt);
		text = odczyt.nextLine();
		int licznik = Integer.parseInt(text);
		for (int i = 0; i <= licznik; i++) {

			if (i % 2 == 0) {
				System.out.println("ta liczba jest parzysta " + i);
			} else {
				System.out.println("ta liczba jest nie parzysta " + i);
			}
		}

	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
	}
}
