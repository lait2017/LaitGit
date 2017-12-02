package laitJava.robertLajtPack;

import java.util.Scanner;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class RobertLajt {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("wproawadz liczbe");
		 String mojazmienna = wczytywaniezKonsoli();
		int zmiennaZKonsoli = Integer.parseInt(mojazmienna);
		 for (int licznik =0 ;licznik<=zmiennaZKonsoli;licznik++ ) {
			 if(licznik%2==0 ) {
				 System.out.println("Liczba parzysta "+ licznik);
			 }
			 else {
				 System.out.println("Liczba nie parzysta "+ licznik);
			 }
		 }
		
		for (int i = 0; i < 10; i++) {
			
			
			if (i==6) {
				break;
			}
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}

		// czwiczeniezWcytywania();
//cwieczeniezFarehaita();

//int key= Integer.parseInt(wczytywaniezKonsoli());
String key =wczytywaniezKonsoli();
//switch (key) {
//case "ala":
//	System.out.println("Ala ma Kota");
//	break;
//case "pies":
//	System.out.println("Pies ma Ale");
//	break;
//default:
//	System.out.println("Nie ma Ali i nie Ma kota");
//	break;
//}
//int i = 10;
//System.out.println("teraz while");
//while (i >0) {
//	
//	Thread.sleep(1000);
//	System.out.println("bomba wybuchnie za"+i);
//	i--;
//}
//System.out.println("teraz for");
//for (int j = 10; j > 0; j--) {
//	Thread.sleep(1000);
//	System.out.println("bomba wybuchnie za"+j);	
//}
//int k=5;
//System.out.println("teraz Do While");
//do {
//	Thread.sleep(1000);
//	System.out.println("bomba wybuchnie za"+k);
//	k--;
//} while (k<0);

		for (int j = 0; j < 10; j++) {
			for (int j2 = 0; j2 < 10; j2++) {
				for (int l = 0; l < 10; l++) {
					Thread.sleep(1000);
					System.out.println("obrot petli 1 =" + j);
					System.out.println("obrot petli 2 =" +j2);
					System.out.println("obrot petli 3 =" +l);
					System.out.println();
				}
			}
		}
//Bomba wybuchnie za ...


//Napisz program, który pobierze od u¿ytkownika imiê i przechowa je w zmiennej. 
//Nastêpnie stwórz kilka warunków z ró¿nymi imionami. 
//Jeœli któreœ z imion bêdzie pasowa³o wyœwietl "Czeœæ jakieœ_imiê", 
//gdy program nie znajdzie imienia wyœwietl "Przykro mi, ale Ciê nie znam".

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
 
		System.out.println("Najwiêksza: " + largest);
 
		if (a < b) {
			smallest = a;
		} else {
			smallest = b;
		}
 
		if (c < smallest) {
			smallest = c;
		}
	
	}
	
	static void cwieczeniezFarehaita() {
		/*
		 * Napisaæ program s³u¿¹cy do konwersji wartoœci temperatury podanej w stopniach
		 * Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
		 * Celsjusza + 32.0)
		 */
		
		
		String zkonsoli = wczytywaniezKonsoli();
		int liczba;
		Integer liczbaDokonwersji =0;
		liczba = liczbaDokonwersji.parseInt(zkonsoli);
		double farenhite = 1.8 *liczba +32;
		System.out.println(zkonsoli +" celcisusza to farenhaita "+ farenhite );
		System.out.println(zkonsoli + " stopni celciu" +  "sza to "
				+( 1.8 * Integer.parseInt(zkonsoli) + 32) +" stopni farenhaita");
	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
	}

	static void czwiczeniezWcytywania() {
		String text = wczytywaniezKonsoli();
		System.out.println(text);
		Integer liczbazKonsoli = 0;
		text = wczytywaniezKonsoli();
		int liczba = liczbazKonsoli.parseInt(text);
		System.out.println(liczba + 5);
	}

	static void mojaMetodaZmienne() {
		int zmiennaInt = 1;
		int zmiennaInt2 = 3;
		System.out.println(zmiennaInt);
		System.out.println(zmiennaInt + zmiennaInt2);
		System.out.println(zmiennaInt / zmiennaInt2);
		System.out.println(zmiennaInt * zmiennaInt2);
		System.out.println(zmiennaInt - zmiennaInt2);
		System.out.println(zmiennaInt % zmiennaInt2);

		String string = "napis 123";
		char d = 'a';
		double ziennoPrzecinkowa = 3.0;

		boolean prawdaFalsz = false;

		if (prawdaFalsz) {
			System.out.println("jestem w ifie" + zmiennaInt);
			zmiennaInt++;
		}

		if (true) {
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

	static void cwiczeniezLiczenia() {
		// 1.3 Napisz prosty kalkulator,
		// w którym bêdziesz przechowywa³ 3 zmienne typu double o nazwach a,b,c.
		// (a+b)*c
		// a-b/c
		/**
		 * u¿yj operatorów inkrementacji i zwiêksz wszystkie zmienne o 1. Teraz porównaj
		 * ze sob¹, czy: (a+b)>c czy a=b? Przedstaw wyniki w konsoli.
		 * 
		 */

		double a, b, c;
		a = 1.0;
		b = 2.0;
		c = 3.0;
		System.out.println("(a+b)*c= " + ((a + b) * c));
		System.out.println("a-b/c= " + (a - b / c));

		a++;
		b++;
		c++;

		System.out.println("Czy a+b>c? " + ((a + b) > c));
		System.out.println("Czy a=b? " + (a == b));

	}
}
