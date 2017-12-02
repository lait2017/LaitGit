package laitJava;
import java.util.Scanner;

public class grzesiek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int i,a ; 		
		 Scanner skaner = new Scanner(System.in);
		 System.out.println(" Podaj liczbe , liczba powinna byæ dodatnia");
         a= skaner.nextInt();
    
         for (i=0 ; i<=a ; i++)
         {   if  ( i % 2==0) {
        	 System.out.println("ta liczba jest parzysta: "+i);
         }
         else 
         {   System.out.println("ta liczba jest nieparzysta: "+i);
          }
        	 
        	 
         }
	}

}
