package Robert1paczka;

import java.util.Scanner;

public class Robert4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisz program, kt�ry oblicza warto�� x z r�wnania ax+b = c.
				//Warto�ci a, b i c nale�� do zbioru liczb rzeczywistych i s�
				//wprowadzane z klawiatury. Dodatkowo nale�y zabezpieczy�
				//program na wypadek sytuacji, kiedy wprowadzona warto�� a
				//b�dzie r�wna zero.
		
		  Scanner xd = new Scanner(System.in);
		    System.out.println("Mamy dzia�anie ax+b=c");
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
