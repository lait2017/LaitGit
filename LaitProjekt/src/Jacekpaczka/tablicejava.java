package Jacekpaczka;
import java.util.Scanner;
public class tablicejava {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
        String []imiona = new String[5];
for (int i=0;i<5;i++){
imiona[i]=odczyt.nextLine();
}
for (int i=0;i<5;i++){
    System.out.println(imiona[i]);
}
		
/*		 String imiona []= {"Basia","Ola","Grzesiek","Jacek","Tomek"};
	        for (int i=0; i<5; i++) {
	            System.out.println("witaj imie "+ imiona[i] +" z tablicy");
	               
	        }
		
		/*		  int[] tablica = new int[10];

	        for (int i = 0; i < 10; i++) {
	            tablica[i-1] = i + 1;
	        }
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Kolejna komórka to: " + tablica[i]);
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
	        for (int i = 0; i < tablicaparzysta.length; i++) {
	            System.out.println("Indeks  paryste" + i + "Wrtosc"+ tablicaparzysta[i]);
	        }

	        for (int i = 0; i < tablicanieparzysta.length; i++) {
	            System.out.println("Indeks nie parzyste " + i + "Wrtosc"+ tablicanieparzysta[i]);
	        }
		System.out.println("wprowadz liczbe dodatnia");
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
		
	}

}
