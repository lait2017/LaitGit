package laitJava;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Robert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	

static void cwiczeniezFarenheita() {
// Napisaæ program do konwersji wartoœci temp w celsjuszach na farenheity
// Farenheit = 1.8 * Celsjusz + 32.0
	
String zkonsoli = wczytywaniezKonsoli();
System.out.println(zkonsoli() + "stopni Celsjusza to" + 1.8 * Integer.parseInt(zkonsoli() + 32 + "Stopni Farenheita"));
//int liczba;
//Integer licz = 0;
//liczba = licz.parseInt(zkonsoli);


//int liczba2 = Integer.parseInt(wczytywaniezKonsoli());
}
	



static String wczytywaniezKonsoli() {
	String text;
	Scanner odczyt = new Scanner(System.in);
	text = odczyt.nextLine();
	return text;
	
}
	





static void cwiczeniezwczytywania() {
	String text = wczytywaniezKonsoli();
	System.out.println(text);
	Integer liczbazKonsoli = 0;
	text = wczytywaniezKonsoli();
	int liczba = liczbazKonsoli.parseInt(text);
	System.out.println(liczba + 5);

}










void mojaMetodaZmienne() {

int zmiennaInt = 1;
int zmiennaInt2 = 3;

System.out.println(zmiennaInt + zmiennaInt2);
System.out.println(zmiennaInt / zmiennaInt2);
System.out.println(zmiennaInt - zmiennaInt2);
System.out.println(zmiennaInt * zmiennaInt2);
System.out.println(zmiennaInt % zmiennaInt2 + " Reszta z dzielenia");

String strang = "napis 123";
char h = 'a' ;
double zmiennoPrzecinkowa = 3.0;
boolean prawdafalsz = false;

//Instrukcje warunkowe
if (prawdafalsz) {
System.out.println("jestem w ifie" + zmiennaInt);
zmiennaInt++;
}
if (!prawdafalsz) {
	System.out.println("jestem w ifie" + zmiennaInt);
	zmiennaInt++;
	}
if (true) {
	System.out.println("jestem w ifie" + zmiennaInt);
	zmiennaInt++;
	}
if (5==5) {
	System.out.println("jestem w ifie" + zmiennaInt);
	zmiennaInt++;
	}
if (2<5) {
	System.out.println("jestem w ifie" + zmiennaInt);
	zmiennaInt++;
	}
if (2>=5) {
	System.out.println("jestem w ifie" + zmiennaInt);
	zmiennaInt++;
	}
if (2!=5) {
	System.out.println("jestem w ifie" + zmiennaInt);
	zmiennaInt++;
	}

if (2>=5) {
	System.out.println("jestem w ifie");
} else {
	System.out.println("jestem w elsie");
}

}








static void cwiczeniezliczenia() {
	// Kalkulator z trzema zmiennnymi double abc i wyœwietl wyniki 
		// (a+b)*c
		// a-b/c
	double a = 4.0;
	double b = 4.0;
	double c = 7.0;

	// U¿yj operatorów inkrementacji i zwiêksz wszystkie zmienne o 1
	// I spróbóuj porownac ze seoba (a+b)>c czy a=b?

	a++;
	b++;
	c++;

	/*System.out.println((a+b)>c);

	if ((a+b)>c) {
		System.out.println("true");
		} else {
			System.out.println("false");
		}

	if (a==b) {
		System.out.println("true");
		} else {
			System.out.println("false");
		}
	*/
}

}