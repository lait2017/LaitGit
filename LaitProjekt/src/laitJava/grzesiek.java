package laitJava;

import java.util.Scanner;

public class grzesiek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        //  System.out.println(text + ((a+b)>c) );
		 cwiczeniezFarenhaita();
     
      }
	
	static void cwiczeniezFarenhaita() {
		
		double F ;
		
		System.out.println ( "Podaj temperature z stopniach Celsjusza ");
		int liczba;
		String zkonsoli = wczytywaniezKonsoli();
		Integer licz = 0; 
		liczba = licz.parseInt(zkonsoli) ;
		F = (1.8 * liczba) + 32 ;
		System.out.println ( "Temperatura w stopniach Fahrenhaita " + F);
		
		
		
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

