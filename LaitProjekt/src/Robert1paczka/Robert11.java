package Robert1paczka;

import java.util.Scanner;

public class Robert11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Program pobierajacy dodatnia liczbe od uzytkownika i w petli od 0 do tej liczby wypisze czy liczba jest parzysta lub czy jest nieparzysta
		 System.out.println("Podaj liczbe dodatnia");
		 
		 Scanner xd = new Scanner(System.in);
		 int a = xd.nextInt();
		 
		 
		 for (int i = 0; i <= a; i++) {
				System.out.print(i);
		if (i%2 == 1 || i == 0) {
			System.out.println(" <---- Liczba Nieparzysta");
		} else {
         System.out.println(" <---- Liczba Parzysta");
		}	
	}

}
}
