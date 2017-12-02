package tomeklaitpackage;

import java.util.Scanner;

public class tomeklait {

	public static void main(String[] args) throws InterruptedException {

		//System.out.println("Wprowadz liczbe dodatnia");
		//String text;
		//Scanner odczyt = new Scanner(System.in);
		//text = odczyt.nextLine();
		//int licznik = Integer.parseInt(text);
		//for (int i = 0; i <= licznik; i++)
			
	//	{

	//		if (i % 2 == 0) {
	//			System.out.println("Ta liczba jest parzysta " + i);
	//		} else {

	//			System.out.println("Ta liczba jest nieparzysta " + i);
	//		}
	//	}

	//	System.out.println("Prosze podac dlugosci bokow prostokata. ");
	//	String zkonsoli = wczytywaniezKonsoli();
	//	int liczba;
	//	Integer licz = 0;
	//	liczba = licz.parseInt(zkonsoli);
	//	String zkonsoli1 = wczytywaniezKonsoli();
	//	int liczba1;
	//	Integer licz1 = 0;
	//	liczba1 = licz1.parseInt(zkonsoli);
	//	System.out.println("Pole prostokąta to " + (liczba * liczba1));


		double a;
		double b;
		a = 37;
		b = 11;

		System.out.println("Wynik dzielenia 37 i 11 to " + a / b);


		System.out.println("Wynik dzielenia to " + a / b + " ,reszta to " + a % b);
	}





	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		return text;
	}
}

