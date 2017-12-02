package Robert1paczka;

import java.util.Scanner;

public class Robert4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisz program, który oblicza wartoœæ x z równania ax+b = c.
				//Wartoœci a, b i c nale¿¹ do zbioru liczb rzeczywistych i s¹
				//wprowadzane z klawiatury. Dodatkowo nale¿y zabezpieczyæ
				//program na wypadek sytuacji, kiedy wprowadzona wartoœæ a
				//bêdzie równa zero.
		
		  Scanner xd = new Scanner(System.in);
		    System.out.println("Mamy dzia³anie ax+b=c");
		    System.out.println("Podaj liczbe a");
		    int a = xd.nextInt();
		    System.out.println("Podaj liczbe b");
		    int b = xd.nextInt();
		    System.out.println("Podaj liczbe c");
		    int c = xd.nextInt();
		    
		    if (a==0 || b==0 || c==0) {
		    	System.out.println("Error");
			} else {
				System.out.println("x w naszym przypadku wynosi " + ((c-b)/a));
			}
			}
	
}
