package laitJava;

import java.util.Scanner;

public class tomek {

	public static void main(String[] args) {
	


// cwiczeniezWczytywania();
cwiczenie3liczby();

	}
	
	static void cwiczeniezFarenheita() {
		String zkonsoli= wczytywaniezKonsoli();
		int liczba;
		Integer licz = 0;
		liczba = licz.parseInt(zkonsoli);
		System.out.println(1.8 * liczba +32.0);
		
	}
	
	static void cwiczenie3liczby() {
		String zkonsoli = wczytywaniezKonsoli();
		int a;
		Integer licz = 0;
		a = licz.parseInt(zkonsoli);
		String zkonsoli2 = wczytywaniezKonsoli();
		int b;
		Integer licz1 = 0;
		b = licz1.parseInt(zkonsoli2);
		if (a > b) {
			System.out.println(+a +" to jest najwieksza liczba" );}
			else {
				System.out.println(+b +" to jest najwieksza liczba");
		}
	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text= odczyt.nextLine();
		return text;
		
	}
	
	static void cwiczeniezWczytywania() {
		String text = wczytywaniezKonsoli();
		System.out.println(text);
		Integer liczbazKonsoli = 0;
		text= wczytywaniezKonsoli();
		int liczba = liczbazKonsoli.parseInt(text); //zmiana liczby na tekst
		System.out.println(liczba +5);
	}
	
	static void mojaMetodaZmienne () {
		int zmiennaInt = 1;
		int zmiennaInt2 = 3;
		System.out.println(zmiennaInt + zmiennaInt2);
		System.out.println(zmiennaInt / zmiennaInt2);
		System.out.println(zmiennaInt * zmiennaInt2);
		System.out.println(zmiennaInt - zmiennaInt2);
		System.out.println(zmiennaInt % zmiennaInt2);
		
		String string = "napis 123";
		char j = 'j';
		double zmiennoPrzecinkowa = 3.0;
		boolean prawdaFalsz = false;
		
		if (prawdaFalsz) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}
		
	if (true) {
		System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}
		
	if (2>=5) {
		System.out.println("jestem w ifie" + zmiennaInt);	
	} else {
			System.out.println("jestem w elsie");
		};


	if (2!=5) { //rozne
		System.out.println("jestem w ifie" + zmiennaInt);
		zmiennaInt++;
	}

	String napis = "napis";
	if (napis.equals("napis")) {
		System.out.println("jestem w ifie z napisem");
	}
	}
	static void cwiczeniezliczenia() {
		double a = 4.0;
		double b = 6.0;
		double c = 1.0;

		System.out.println((a+b)*c);
		System.out.println(a-b/c);

		a++;
		b++;
		c++;

		System.out.println((a+b)>c);
		System.out.println(a==b);

	}
}
