package laitJava;

import java.util.Scanner;

public class Monika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = wczytywaniezKonsoli();
		System.out.println(text);
		Integer liczbazKonsoli=0;
		text =wczytywaniezKonsoli();
		int liczba= liczbazKonsoli.parseInt(text);
		System.out.println(liczba+5);
	

	}
	
	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
		
	}	
		static void cwiczeniezWczytywania() {
			String text = wczytywaniezKonsoli();
			System.out.println(text);
			Integer liczbazKonsoli=0;
			text =wczytywaniezKonsoli();
			int liczba= liczbazKonsoli.parseInt(text);
			System.out.println(liczba+5);
		}
		
		static void cwiczeniezFarenheita() {
			
			
				String zkonsoli = wczytywaniezKonsoli();
				int liczba;
				Integer liczbaDokonwersji=0;
				liczba = liczbaDokonwersji.parseInt(zkonsoli);
				double farenheit = 1.8*liczba+32;
				System.out.println(zkonsoli + "celsjusza to farengheita" + farenheit);
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
		double ZmiennoPrzecinkowa = 3.0;
		boolean prawdaFalsz = false;

		if (true) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}
		if (2 == 5) {
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
	void cwiczeniezLiczenia() {
		double zmiennaa, zmiennab, zmiennac;
		zmiennaa = 2;
		zmiennab = 3;
		zmiennac = 4;
		System.out.println((zmiennaa + zmiennab) * zmiennac);
		System.out.println(zmiennaa - zmiennab / zmiennac);

		zmiennaa++;
		zmiennab++;
		zmiennac++;

		System.out.println((zmiennaa + zmiennab) > zmiennac);
		System.out.println(zmiennaa == zmiennab);

		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();

		System.out.println(text + ((zmiennaa + zmiennab) > zmiennac));
		Integer liczbazKonsoli = 0;
		text = odczyt.nextLine();
		int liczba = liczbazKonsoli.parseInt(text);
		System.out.println(liczba + 5);
	}
}
