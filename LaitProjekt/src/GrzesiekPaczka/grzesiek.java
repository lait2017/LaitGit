package GrzesiekPaczka;

import java.util.Scanner;

public class grzesiek {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	        //  System.out.println(text + ((a+b)>c) );
		 cwiczeniezFarenhaita();
     //trzyliczby();
int i = 10;
while ( i >  0 ) {
	System.out.println ("while " + i);
	i--;
}
     
int j;
for ( j=10 ; j > 0 ; j-- ) 
{
	System.out.println ("for"+j);
}

int k=10;
do {
	Thread.sleep(1000);
	System.out.println ("do while "  +k);
	k--;
} while (k > 0) ;

      }
	
	static void trzyliczby() {
		int licz1, licz2,licz3 , maxlicz=0;
	    Integer licz;
		
		
		System.out.println ( "Podaj pierwsza liczbe: ");
		licz1 = Integer.parseInt(wczytywaniezKonsoli());
		System.out.println ( "Podaj druga liczbe: ");
		licz2 =Integer.parseInt(wczytywaniezKonsoli());
		System.out.println ( "Podaj trzecia liczbe: ");
		licz3 = Integer.parseInt(wczytywaniezKonsoli());
		
		if  ( licz1 >= licz2  &&  licz1 >= licz3 ) 
		{
			maxlicz =licz1;
			}
		if  ( licz2 >= licz1  &&  licz2 >= licz3 ) 
		{ 
			maxlicz =licz2;
			}
		if  ( licz3 >= licz1  &&  licz3 >= licz2 ) 
		{ 
			maxlicz =licz3;
			}
		System.out.println ( "Najwieksza liczba to: " +  maxlicz);
		
	}
	
	
	static void cwiczeniezFarenhaita() {
		
		double F ;
		int ii;
		for ( ii=1 ; ii < 11 ; ii++) {
			System.out.println ( "to jest " + ii + "  uruchomienie fahre.....") ;
			System.out.println (" =========================================" );
		System.out.println ( "Podaj temperature z stopniach Celsjusza ");
		int liczba;
		String zkonsoli = wczytywaniezKonsoli();
		Integer licz = 0; 
		liczba = licz.parseInt(zkonsoli) ;
		F = (1.8 * liczba) + 32 ;
		System.out.println ( "Temperatura w stopniach Fahrenhaita " + F);
		
		
		}
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

