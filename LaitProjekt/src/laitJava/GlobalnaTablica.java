package laitJava;

import java.util.Random;
import java.util.Scanner;

public class GlobalnaTablica {

	 int  tabInt[] = new int[50];

	 public GlobalnaTablica() {
		wypelnijTabliceLosowymiLiczbami(); 
	 }
	 

	 void wypelnijTabliceLosowymiLiczbami() {
		int liczbaRand;
		Random r = new Random();
		liczbaRand = (r.nextInt(50));
		liczbaRand = (r.nextInt());
		for (int i = 0; i < 50; i++) {
			liczbaRand = (r.nextInt(500));
			tabInt[i] = liczbaRand;
		}
		System.out.println("Wype³niam tablice losowymi liczbami");
	}
/**
 * Metoda do wyswietlania zawartosci globalenejtablicy.
 * 
 */
	void wyswietlZawartoscTablicy() {

		System.out.println("Zawartoœæ tablicy to:");
		for (int i : tabInt) {
			System.out.print(" " + i);
		}
	}

	public void wyswietlMiniMaxZtablicy() {

		int max = 0, min = 500;
		for (int i = 0; i < 50; i++) {
			if (tabInt[i] >= max) {
				max = tabInt[i];
			}
			if (tabInt[i] <= min) {
				min = tabInt[i];
			}
			System.out.println(tabInt[i]);
		}
		System.out.println("max " + max + " min " + min);

	}

	public void obliczSredniaArytmetycznaElementow() {
		System.out.println("ForEach");
		int suma = 0;
		for (int i : tabInt) {
			suma = suma + i;
		}
		System.out.println("suma elementów tablicy " + "to " + suma + "\n a œrednia arytmetyczna"
				+ " elementów tablicy to:" + (suma / tabInt.length));

	}

	public void minmax() {
		System.out.println("wprowadz liczbe dodatnia");
		String text;
		Scanner odczyt = new Scanner(System.in);
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
}
