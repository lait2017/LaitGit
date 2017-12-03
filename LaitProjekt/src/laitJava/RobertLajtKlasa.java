package laitJava;

public  class RobertLajtKlasa {
	static int  zmiennaInt =0;
	static int tabGlob [] = new int[50];
public static void main(String[] args) {
	
	WyswietlTablice();
	
	if (zmiennaInt ==2) {
	System.out.println(zmiennaInt);
	}
}

static void  WyswietlTablice() {
	for (int i = 0; i < tabGlob.length; i++) {
		System.out.println(tabGlob[i]);
	}
}

static void  NowaMetoda() {
	zmiennaInt = 5;
}
}
