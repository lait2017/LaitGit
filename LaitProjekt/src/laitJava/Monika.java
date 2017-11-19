package laitJava;

import java.util.Scanner;

public class Monika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cwiczenie3Liczby();
		//cwiczeniezFarenheita();
		//wczytywaniezKonsoli();
		
//		int k=10;			
//	for (k = 10; k >= 0; k--) {
// System.out.println("odliczanie..." + k);
		
//		}
	
	
	int m=10;
	System.out.println("odliczanie" + m);
			while (m<0) {
					m++;
			}		
	
	//	int i=0;
	//	System.out.println("teraz while");
	//			while (i<10) {
	//				System.out.println(i);
	//				i++;
//								}
//				System.out.println("teraz for");			
//			for (int j = 10; j < 10; j++) {
//					System.out.println(j);
//				}
	//i=0;
//	do {
//		System.out.println("teraz do while");
//		i++;
//	} while (i<10);
				
				
	int key=Integer.parseInt(wczytywaniezKonsoli());
	
	switch (key) {
	case 1:
		System.out.println("to jest opcja 1");
		break;
		
	case 2:
		System.out.println("to jest opcja 2");
		break;
	case 3:
		System.out.println("to jest opcja 3");
		break;
	case 4:
		System.out.println("to jest opcja 4");
		break;
	default:
		System.out.println("to jest opcja default");
		break;
	}
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
 
		System.out.println("Najwieksza: " + largest);
 
		if (a < b) {
			smallest = a;
		} else {
			smallest = b;
		}
 
		if (c < smallest) {
			smallest = c;
		}
		System.out.println("Najmniejsza: " + smallest);
		
		
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
