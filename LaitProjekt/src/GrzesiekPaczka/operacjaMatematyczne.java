package GrzesiekPaczka;

import java.util.Scanner;

public class operacjaMatematyczne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		
		Scanner skaner = new Scanner(System.in);
	
		 System.out.println(" Podaj dwie zmienne: ");
	 /*  x = skaner.nextDouble();
	   y = skaner.nextDouble();
	   
	   System.out.println(" Suma: "+ (x+y) );
	   System.out.println(" Ró¿nica: "+ (x-y));
	   System.out.println(" Iloraz :"+ (x/y));
	   System.out.println(" loczyn: " + (x*y));
	
		
	   
		double a,b,c;
		System.out.println(" Podaj 2 boki trojkata: ");
		a = skaner.nextDouble();
		b = skaner.nextDouble();
		c = skaner.nextDouble();
		
		if ((a*a) + (b*b)==(c*c) )
		{
			System.out.println("trojkat prostokatny"); }
		else 
		{ 
			System.out.println("To nie jest trojkat prostokatny");}
		
		double aa,bb=0.0,cc=0.0;
		System.out.println(" Podaj 3 liczby rownania ax+b =c: ");
		aa = skaner.nextDouble();
		if (aa==0.0) {
			System.out.println("Zmienna A nie mo¿e byc rowna  zero ");
			}
		
		else
		bb = skaner.nextDouble();
		cc = skaner.nextDouble();
		System.out.println("zmienna x =  " + (cc-bb)/aa);

		
		int i;
		// double xx=0.0;
		
		// xx= skaner.nextDouble();
		for (i=1;i<10;i++)
			System.out.println("for : wartosc funkcji y=3x :" + (3*i));
		
		
		int j=1;
		do { 
			
			System.out.println("do - while :wartosc funkcji y=3x :" + (3*j));
			j++;
		}
			
			while (j<10);
		
		
		int k=1;
		while (k<10)
		{
			System.out.println(" while :wartosc funkcji y=3x :" + (3*k));
			k++;
		}
	
		int e;
		for (e=1;e<=20;e++)
		{
			System.out.println(" wyswietla liczby w przedziale (1-20) :" +e);
		}
		
		int f=1;
		do {
			System.out.println("do -while  wyswietla liczby w przedziale (1-20) :" +f);	
			f++;
		}
		while (f<=20);
		
		int g=1;
		while (g<=20)
		{
			System.out.println("while -  wyswietla liczby w przedziale (1-20) :" +g);
			g++;
		}
		*/
		int h,suma=0;
		for (h=1;h<=100;h++)
		{
			
			if ( !(h%2==0) )
			suma=suma+h;	
			//System.out.println(" suma 1-100 :" +suma);
		}
		System.out.println(" suma nieparzystych 1-100 :" +suma);
	}

}
