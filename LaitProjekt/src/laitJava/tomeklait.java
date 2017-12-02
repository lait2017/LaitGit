package laitJava;

import java.util.Scanner;

public class tomeklait {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Wprowadz liczbe dodatnia");
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		int licznik = Integer.parseInt(text);
		for (int i = 0; i <= licznik; i++)
			
		{

			if (i % 2 == 0) {
				System.out.println("Ta liczba jest parzysta " + i);
			} else {

				System.out.println("Ta liczba jest nieparzysta " + i);
			}
		}

	}
}
