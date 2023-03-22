package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

    private static String si;

    public static void main(String[] args) {

	System.out.println("QUESTO E' IL PRODOTTO: " + somma(10, 4));
	System.out.println("QUESTO E' LA CONCATENAZIONE: " + sommaParole("STRINGA ", 4));

	String cinqueGiorni[] = new String[5];
	cinqueGiorni[0] = "primo";
	cinqueGiorni[1] = "secondo";
	cinqueGiorni[2] = "terzo";
	cinqueGiorni[3] = "quarto";
	cinqueGiorni[4] = "quinto";
	for (int i = 0; i < 5; i++) {
	    System.out.println("QUESTO E' L ARRAY UNO -------->: " + cinqueGiorni[i]);
	}

	String sesto = "sesto";
	String cinqueGiorniDue[] = new String[cinqueGiorni.length + 1];
	cinqueGiorniDue[0] = "primo";
	cinqueGiorniDue[1] = "secondo";
	cinqueGiorniDue[2] = "terzo";
	cinqueGiorniDue[3] = sesto;
	cinqueGiorniDue[4] = "quarto";
	cinqueGiorniDue[5] = "quinto";
	for (int i = 0; i < 6; i++) {
	    System.out.println("QUESTO E' L ARRAY DUE------->: " + cinqueGiorniDue[i]);
	}

	System.out.println("inserire una stringa-------------------------------");
	Scanner sc = new Scanner(System.in);
	String stringaUno = sc.nextLine();
	String stringaDue = sc.nextLine();
	String stringaTre = sc.nextLine();
	System.out.println("stringa inserita: " + stringaUno + " " + stringaDue + " " + stringaTre);
	System.out.println("stringa inserita: " + stringaUno + " " + stringaTre + " " + stringaDue);

	System.out.println("IL PERIMETRO DEL RETTANGOLO E': " + perRett(10.25, 5.0245296));

	System.out.println("PARI O DISPARI: " + pariDispari(27));

    }

    public static int somma(int x, int y) {
	return x * y;
    }

    private static String sommaParole(String p, int pp) {
	return p + pp;
    }

    public static double perRett(double a, double d) {
	return (a * 2) + (d * 2);
    }

    public static String pariDispari(int n) {
	if (n % 2 == 0) {
	    return ("E' PARI");
	} else {
	    return ("E' DISPARI");
	}
    }

} // PARENTESI MAIN
