package Robert1paczka;

import java.util.Scanner;

public class Robert13 {

	public static void main(String[] args) {
/*		
		 int[] tablica = new int[10];

	        for (int i = 10; i > 0; i--) {
	            tablica[i-1] = i - 1;
	        }
	        for (int i = 9; i >= 0; i--) {
	            System.out.println("Indeks " + i + " Wartosc " + tablica[i]);
	        } 
	        
	        System.out.println("wprowadz liczbe dodatnia");
	        String text;
	        Scanner odczyt = new Scanner(System.in);
	        //text = odczyt.nextLine();
	        int licznik = odczyt.nextInt();

	        int tablicaparzysta[] = new int[licznik];
	        int tablicanieparzysta[] = new int[licznik];


	        for (int i = 0; i < licznik; i++)
	            if (i % 2 == 0) {
	                //System.out.println("ta liczba jest parzysta " + i);
	                tablicaparzysta[i/2]=i;
	            } else {
	                tablicanieparzysta[i/2] = i;
	            }               // System.out.println("ta liczba jest nie parzysta " + i);
	        for (int i = 0; i < tablica.length; i++) {
	            System.out.println("Indeks  paryste" + i + "Wrtosc"+ tablicaparzysta[i]);
	        }

	        for (int i = 0; i < tablica.length; i++) {
	            System.out.println("Indeks nie parzyste " + i + "Wrtosc"+ tablicanieparzysta[i]);
	        }
	}
}
	*/
		// Tablice
	/*	System.out.println("wprowadz liczbe dodatnia");
	     String text;
	     Scanner odczyt = new Scanner(System.in);
	     text = odczyt.nextLine();
	     int licznik = Integer.parseInt(text);
	 
	     for (int i=0; i<= licznik; i++)
	         if (i % 2 == 0) {
	             System.out.println("ta liczba jest parzysta " + i);
	         } else
	             System.out.println("ta liczba jest nie parzysta " + i);
	       */      


//Napisz program, w którym zadeklarujesz i utworzysz piêcioelementow¹ tablicê odpowiedniego typu. 
//W pêtli pobierzesz od u¿ytkownika 5 imion i je w niej zapiszesz. 
//Nastêpnie wyœwietl na ekranie powiadomienia "Witaj imie_z_tablicy" dla ka¿dego z podanych parametrów. 
	//jezeli liczba = 3 wypisz to jezeli liczba = 5 wypisz to jezeli to i to to wypisz to
		 System.out.println("Podaj imiona");
		Scanner odczyt = new Scanner(System.in);
        String []imiona = new String[5];
for (int i=0;i<5;i++){
imiona[i]=odczyt.nextLine();
}
for (int i=0;i<5;i++){
    System.out.println("Witaj " + imiona[i]);
}
}
}