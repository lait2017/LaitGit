package Jacekpaczka;

public class sumowanienieparzystych {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Napisz program, który za pomoc¹ instrukcji for sumuje liczby
nieparzyste z przedzia³u od 1 do 100
 */
	
		int x;
		int suma=0;
		
		System.out.println("liczy sume liczb nieparzystych od 1 do 100");

		for (x=1;x<100;x=x+2)
			suma=suma + x;
			System.out.println(suma);
	
	
	}

}
