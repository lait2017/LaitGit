package GrzesiekPaczka;
import java.util.Scanner;

public class grzesiek1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
       /*  int i,a ;
		 Scanner skaner = new Scanner(System.in);
		 System.out.println(" Podaj liczbe , liczba powinna by� dodatnia");
         a= skaner.nextInt();
    
         for (i=0 ; i<=a ; i++)
         {   if  ( i % 2==0) {
        	 System.out.println("ta liczba jest parzysta: "+i);
         }
         else 
         {   System.out.println("ta liczba jest nieparzysta: "+i);
          }  */
        // String zkonsoli = wczytywaniezKonsoli();
        Double licz = 0.0;
        double A, B, C;
        Scanner skaner1 = new Scanner(System.in);
        System.out.println(" Podaj bok prostokata A");
        String zkonsoli = wczytywaniezKonsoli();
        A = licz.parseDouble(zkonsoli);
        // A = skaner.nextInt();
        System.out.println(" Podaj bok prostokata B");
         zkonsoli = wczytywaniezKonsoli();
        // B = skaner.nextInt();
        B = licz.parseDouble(zkonsoli);
        System.out.println(" Pole prostokąta wynosi: " + (C = A * B));
       int AA , BB , CC ;
        System.out.println( "Podaj AA :");
AA= skaner1.nextInt();
        System.out.println("Podaj BB : ");
BB= skaner1.nextInt();
        System.out.println("reszta z dzielenia: "+ (A%B) );

    }


    static String wczytywaniezKonsoli() {
        String text;
        Scanner odczyt = new Scanner(System.in);
        text = odczyt.nextLine();
        System.out.println(text);
        //	 odczyt.close();
        return text;
    }


    // Scanner skaner = new Scanner(System.in);
}
