
package laitJava;

import java.util.Scanner;

public class Jacek {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		cwiczeniezFarenhaita();
		//liczenie2liczb();
		
/*		int i=0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	
		int i=0;
		for (i=0;i<5;i++) {
			System.out.println(i);
		}

		int i=0;
		do {
			System.out.println("do while");
			i++;
		} while (i<10);
	
		System.out.println("petla while");
		int i=6;
		while (i>=0) {
			System.out.println(i);
			i--;  //lub i=i-1;
		}
		
		System.out.println("petla for");
		int j=4;
		for (j=4;j>=0;j--) {
			System.out.println(j);
		}

		System.out.println("petla do while");
		int k=3;
		do {
			System.out.println(k);
			Thread.sleep(1000);
			k--;
		} while (k>=0);
*/	
      }
	

	
	static void liczenie2liczb() {
		int liczba1, liczba2;
		System.out.println("podaj pierwsza liczbe");
		liczba1 = Integer.parseInt(wczytywaniezKonsoli());
		System.out.println("podaj druga liczbe");
		liczba2 = Integer.parseInt(wczytywaniezKonsoli());
		
		if (liczba1>liczba2) {
			System.out.println("najwiêksza liczba to: " + liczba1);
			System.out.println("najmniejsza liczba to: " + liczba2);
		}
		else {
			System.out.println("najwiêksza liczba to: " + liczba2);
			System.out.println("najmniejsza liczba to: " + liczba1);
		}
		
		
	}
	
	
	static void cwiczeniezFarenhaita() {
		
		int i=0;
		double F;
		do {
			System.out.println ( "Podaj temperature z stopniach Celsjusza ");
			int liczba;
			String zkonsoli = wczytywaniezKonsoli();
			Integer licz = 0; 
			liczba = licz.parseInt(zkonsoli) ;
			F = (1.8 * liczba) + 32 ;
			System.out.println ( "Temperatura w stopniach Fahrenhaita " + F);
			i++;
		} while (i<5);
		System.out.println("koniec pêtli");
		
/*		double F ;
		
		System.out.println ( "Podaj temperature z stopniach Celsjusza ");
		int liczba;
		String zkonsoli = wczytywaniezKonsoli();
		Integer licz = 0; 
		liczba = licz.parseInt(zkonsoli) ;
		F = (1.8 * liczba) + 32 ;
		System.out.println ( "Temperatura w stopniach Fahrenhaita " + F);
		
	*/	
		
	}
	
     static String wczytywaniezKonsoli() {
		String text;
		Scanner odczyt = new Scanner(System.in);
		text = odczyt.nextLine();
		 System.out.println( text);
	//	 odczyt.close();
		 return text;
	}
	
     
     static void cwiczeniezWczytywania () {
    	 String text = wczytywaniezKonsoli();
    		System.out.println(text);
    	     Integer liczbazKonsoli = 0 ;
    	     text = wczytywaniezKonsoli();
    	     int liczba = liczbazKonsoli.parseInt(text);
    	     System.out.println( liczba + 5); 
    	 
     }
	
		void mojaMetodaZmienna() {
		
		 int zmienna1 = 1;
		 int zmienna2 = 3;
		 System.out.println(zmienna1 + zmienna2);
		 System.out.println(zmienna1 / zmienna2);
		 System.out.println(zmienna1 * zmienna2);
		 System.out.println(zmienna1 - zmienna2);
		 System.out.println(zmienna1 % zmienna2);
		 
		 String string = "to jest napis ";
		 char aaaaa = 'a';
		 double zmienna3 = 3.0;
		 boolean prawdaFalsz = false;
		 
		 if ( prawdaFalsz ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++;
		 }
			 
		 
		 
		if ( 5 == 5 ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++;
		 }
		 
		if ( 5 < 5 ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++; 
		}

		if ( 5 > 5 ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++;
		}
		if ( 5 >= 5 ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++;
		}

		if ( 5 <= 5 ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++;
		}
		 
		if ( 2!= 5  ) {
			 System.out.println( " jestem w ifie" + zmienna1 );
			 zmienna1++;
		}

		
	}
	
	void cwiczeniezLiczenia () {
		  double a=1.1 , b=2.2 , c=3.3 ;
		  System.out.println( (a+b)*c );
		  System.out.println( a-b/c );
		  
		  a=a++ ;b=b++;c=c++;
		  
		  if ( (a+b) > c ) {
				 System.out.println( "1. to jest prawda : a+b >c " );
				 
			 }
			 
			if ( a==b ) {
				 System.out.println( "2. a rowna sie b "  );
				  }
			else  
			    {   
				 System.out.println( "2. a nie rowna sie b " );  
			    } 
	}

	
	
	
	}
