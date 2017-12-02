package Jacekpaczka;
import java.util.Scanner;
public class Jacek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	 System.out.println("wprowadz liczbe dodatnia");
		 String text;
				Scanner odczyt = new Scanner(System.in);
				text = odczyt.nextLine();
				int licznik = Integer.parseInt(text);
				for (int i = 0; i <= licznik; i++) {
					if (i % 2 == 0) {
						System.out.println("ta liczba parzysta" +i);
					}else {
						System.out.println("nie jest parzysta" +i);
					}
			}
	*/
		Integer a,b,c ;

		System.out.println ( "bok prostokata a ");
		a = Integer.parseInt(wczytywaniezKonsoli());
		System.out.println ( "bok prostokata b ");
		b = Integer.parseInt(wczytywaniezKonsoli());
		c = a * b;
		System.out.println ( "pole prostokata " + c);

	}

	static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		System.out.println( text);
		//	 odczyt.close();
		return text;
	}

}
