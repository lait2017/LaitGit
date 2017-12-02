package laitJava;

import java.util.Scanner;

public class Basia {

	public static void main(String[] args) {
//cwiczeniazWczytywania();
		cwiczeniezFarenheita();

	}
	
	static void cwiczeniezFarenheita() 
	{
		//Celsjusze na F; Fahrenheit = 1.8* stopnie Celsjusza+ 32.00
		
		double F;
		System.out.println("Podaj temeperatur� w Celsjuszach");
		String zkonsoli=wczytywaniezKonsoli();
		int liczba;
		Integer licz = 0;
		liczba  = licz.parseInt(zkonsoli);
		F=(1.8*liczba)+32;
		System.out.println("Temperatura po przeliczeniu: "+ F);
		
		
		
		
		
	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
	}
	
	static void cwizceniezWczytywania() 
	{
		String text = wczytywaniezKonsoli();
		System.out.println((text));
		Integer liczbaKonsoli = 0;
		text = wczytywaniezKonsoli();
		int liczba = Integer.parseInt(text);
		System.out.println(liczba + 5);	
	}

	static void mojaMetodaZmienne() {
		int pierwszaInt = 1;
		int drugaInt = 3;
		System.out.println(pierwszaInt + drugaInt);
		System.out.println(pierwszaInt / drugaInt);
		System.out.println(pierwszaInt * drugaInt);
		System.out.println(pierwszaInt - drugaInt);
		System.out.println(pierwszaInt % drugaInt);

		String ciagiZnakow = "napis123";
		char g = 'g';
		double zmiennoPrzecinkowa = 3.0;
		if (2 != 5) {
			System.out.println("jestem w ifie " + pierwszaInt);
			pierwszaInt++;
		}

		if (pierwszaInt < 0) {
			System.out.println("Mniejsze ni� 0");
		} else {
			System.out.println("wi�ksze od 0");
		}
	}

	static void cwiczeniaZliczenia() {
		// zadanie, 3 double, (a+b)*c
		// a-b/c

		double a = 1.1;
		double b = 2.2;
		double c = 3.3;
		System.out.println((a + b) * c);
		System.out.println(a - b / c);

		// zadanie 2

		a = a++;
		b = b++;
		c = c++;
		System.out.println(a == b);
		System.out.println((a + b) > c);

	}
}
