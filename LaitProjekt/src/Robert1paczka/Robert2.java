package Robert1paczka;		
import java.util.Scanner;
		
public class Robert2 {

public static void main(String[] args) {
/*	
System.out.println("wprowadz liczbe dodatnia");
String text;
Scanner odczyt = new Scanner(System.in);
text = odczyt.nextLine();
int licznik = Integer.parseInt(text);
for (int i = 0; i <= licznik; i++) {

if (i % 2 == 0) {
System.out.println("ta liczba jest parzysta " + i);
} else {
System.out.println("ta liczba jest nie parzysta " + i);

}
}
*/
	
// Napisz program, kt�ry oblicza pole prostok�ta. Warto�ci bok�w
//	a i b wprowadzamy z klawiatury. W programie nale�y przyj��,
//	�e zmienne a, b oraz pole s� typu double (rzeczywistego).	
	

/*
Scanner xd = new Scanner(System.in);
System.out.println("Podaj bok A");
double a = xd.nextInt();
System.out.println("Podaj bok B");
double b = xd.nextInt();
System.out.println("Pole wynosi: "+a*b+"cm2");
*/

/*Napisz program, który oblicza wynik dzielenia całkowitego
  //  bez reszty dwóch liczb całkowitych: a = 37 i b = 11.
    //reszta z dzielenia


    int a = 37;
    int b = 11;
    System.out.println("Liczba pierwsza to " + a);
    System.out.println("Liczba druga to " + b);
    System.out.println("Wynik dzielenia calkowitego liczby pierwszej i drugiej wynosi " + a/b);
    System.out.println("Reszta z dzielenia tych liczb wynosi " + a%b);

    */
 /*   Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz
    dla dwóch liczb x i y wprowadzanych z klawiatury. W programie
    należy założyć, że zmienne x i y są typu float (rzeczywistego).
            Dla zmiennych x, y, suma, roznica, iloczyn i iloraz
    należy przyjąć format ich wyświetlania na ekranie z dokładnością
    do dwóch miejsc po przecinku.
    
    double x,y;
    String text;
    Scanner skaner = new Scanner(System.in);
    text = skaner.nextLine();
    Double dabel = 0.0;
    x = dabel.parseDouble(text);
    
*/
    Scanner xd = new Scanner(System.in);
    System.out.println("Podaj liczbe x");
    double x = xd.nextInt();
    System.out.println("Podaj liczbe y");
    double y = xd.nextInt();
    System.out.println("Suma liczb wynosi: " + (x+y));
    System.out.println("Roznica liczb wynosi: "+ (x-y));
    System.out.println("Iloraz liczb wynosi: "+ (x/y));
    System.out.println("Iloczyn liczb wynosi: "+ (x*y));

}
}
