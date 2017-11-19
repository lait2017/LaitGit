package laitJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Robert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	/* Wczytaæ od u¿ytkownika 3 liczby ca³kowite i wypisaæ na ekran najwiêksz¹
	 * oraz najmniejsz¹ z nich
	 */
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
		System.out.println("Najmniejsza: " + largest);
		
/*        String a = JOptionPane.showInputDialog("Podaj pierwsz¹ liczbê ca³kowit¹: ");
        String b = JOptionPane.showInputDialog("Podaj drug¹ liczbê ca³kowit¹: ");
        String c = JOptionPane.showInputDialog("Podaj trzeci¹ liczbê ca³kowit¹: ");
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int cc = Integer.parseInt(c);
         
        if(aa>bb && bb>cc)JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " +aa +", a najmniejsza to: " +cc);
        else if (cc>bb && bb>aa)JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " +cc +", a najmniejsza to: " +aa);
        else if (bb>cc && cc>aa)JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " +bb +", a najmniejsza to: " +aa);
        else if (aa>cc && cc>bb)JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " +aa +", a najmniejsza to: " +bb);
        else if (bb>aa && aa>cc)JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " +bb +", a najmniejsza to: " +cc);
        else JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " +cc +", a najmniejsza to: " +bb);		
*/		

/* Wczytaæ od u¿ytkownika 2 liczby ca³kowite i wypisaæ na ekran najwiêksz¹
* oraz najmniejsz¹ z nich
*/
		int d = Integer.parseInt(wczytywaniezKonsoli());
		int e = Integer.parseInt(wczytywaniezKonsoli());
		int largest1;
		int smallest1;
		if (d > e) { 
			largest1 = d;
		} else {
			largest1 = e;
		}
		System.out.println("Najwiêksza: " + largest1);
 
		if (d < e) {
			smallest1 = d;
		} else {
			smallest1 = e;
		}
		System.out.println("Najmniejsza: " + largest1);
		
		
		
				// czwiczeniezWcytywania();
		cwieczeniezFarehaita();
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
