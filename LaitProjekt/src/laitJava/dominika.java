package laitJava;

import java.util.Scanner;

public class dominika {
	public static void main(String[] args) throws InterruptedException {
	
		
	

	}
	
	
	
	
	
//cwiczeniezFarenhaita();
		//cwiczeniezFarenhaita();
		 //cwiczeniedwieLiczby();
  		//cwiczeniedwieLiczby();
  		
  		int i =10;
  		System.out.println("teraz while");
  		while (i<10) {
  			System.out.println(i);
  			i++;
  		}
  		System.out.println("teraz for");
  	for (int j= 0; j<10; j++) {
  		System.out.println(j);
  	}
  	i=0;
		
  do {
		System.out.println("teraz do while");
		i++;
  } while (i<10); 
  
  //Odliczanie ();
  int k =10;
	System.out.println("Odliczanie");
	while (k>0) {
		
		k--;
		Thread.sleep (1000);
		System.out.println("bomba wybuchnie za " +k);
	}
	
	  //Przeliczaniestopni ();
	  int m =10;
		System.out.println("przeliczanie stopni");
		while (m>0) {
			
			m--;
			
			cwiczeniezFarenhaita();
		
		}


	

	}
	static void cwiczeniezFarenhaita() {
		String zkonsoli= wczytywaniezKonsoli(); 
		int liczba;
		Integer licz =0;
	    liczba = licz.parseInt(zkonsoli);
	    System.out.println(1.8*liczba+32.0);
		
	    
	 
	}
	
	static void cwiczeniedwieLiczby() {
	  		String zkonsoli= wczytywaniezKonsoli(); 
	  		int a; 
	        Integer licz=0;
	  		a = licz.parseInt(zkonsoli);
	  		 
	  		String zkonsoli2=wczytywaniezKonsoli();
	  		int b;
	  		Integer licz1=0;
	  		b = licz1.parseInt(zkonsoli2);
	  		
	  		if (a>b) {
	  			System.out.println(+a +"najwieksze");
	  		} else {System.out.println(+b +"najwieksze");
	  			
	  		}
	 
		}
	 static String wczytywaniezKonsoli() {
	 String text;
	 Scanner odczyt = new Scanner(System.in);
		text= odczyt.nextLine();
	    return text;
	 }
static void cwiczeniezWczytywania() {
	String text= wczytywaniezKonsoli(); 
	System.out.println(text);
	Integer liczbazKonsoli=0;
	text = wczytywaniezKonsoli();
	int liczba = liczbazKonsoli.parseInt(text);
	System.out.println(liczba + 5 );
	
}

}

}
	
	void mojeMetodaZmienne  () {
	
		int zmiennaInt=1;
		int zmiennaInt2=3;
		System.out.println(zmiennaInt + zmiennaInt2);
		System.out.println(zmiennaInt / zmiennaInt2);
		System.out.println(zmiennaInt * zmiennaInt2);
		System.out.println(zmiennaInt - zmiennaInt2);
		System.out.println(zmiennaInt % zmiennaInt2);

	String string = "napis 123";
	char h = 'd';
	double zmiennoPrzecinkowa = 3.0;
	boolean prawdaFalsz = false;
	
	if (prawdaFalsz) {
		System.out.println("jestem w ifie" + zmiennaInt);
		zmiennaInt++;
		
	}
	if (2==5 ) {
		System.out.println("jestem w ifie" + zmiennaInt);
		zmiennaInt++;
		
	}
	 if (true) {
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
	
	 if (2 >= 5) {
		 System.out.println("jestem w ifie");
		
} else {System.out.println("jestem w w elsie");
}
}
void cwiczeniecwiczenia() {
	double a = 1.0;
	double b = 2.0;
	double c = 3.0;
	System.out.println((a + b)*c);

	System.out.println(a - b/c);

	a++;
	b++;
	c++;
	System.out.println((a + b)>c);
	System.out.println(a==b);

}


		





