package errori;

import java.util.Scanner;

public class Esercizio2 {
    float litri;
    float kilometri;
    Scanner sc = new Scanner(System.in);

    public Esercizio2() {
	while (true) {

	    try {
		inserisciValore();

	    } catch (Exception e) {
		System.out.println(e);
		break;
	    }

	}

    };

    public void inserisciValore() throws Exception {
	System.out.println("inserisci litri");
	litri = sc.nextInt();
	if (litri == 0) {
	    throw new Exception("VALORE INVALIDO!");
	}
	System.out.println("inserisci kilometri");
	kilometri = sc.nextInt();

	float kmL = kilometri / litri;
	System.out.println("I km/l conteggiati sono: " + kmL + "KM/L");
    };
}
