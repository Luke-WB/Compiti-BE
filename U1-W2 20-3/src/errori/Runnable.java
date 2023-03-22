package errori;

public class Runnable {

    public static void main(String[] args) {

	Esercizio1 a = new Esercizio1();
	Esercizio2 b = new Esercizio2();

	// ESERCIZIO 3

	ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

	System.out.println("Saldo conto: " + conto1.restituisciSaldo());

	try {
	    conto1.preleva(1750.5);

	    System.out.println("Saldo conto: " + conto1.restituisciSaldo());
	} catch (BancaException e) {
	    System.out.println("Errore durante il prelievo: " + e);

	}

	ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

	conto2.stampaSaldo();

	try {
	    conto2.preleva(2000);

	    conto2.stampaSaldo();

	} catch (BancaException e) {
	    System.out.println("Errore durante il prelievo2: " + e);

	}
	ContoOnLine conto3 = new ContoOnLine("Bianchi Franco", -50.0, 0);

	conto3.stampaSaldo();

	try {
	    conto3.preleva(100);

	    conto3.stampaSaldo();

	} catch (BancaException e) {
	    System.out.println("Errore durante il prelievo3: " + e);

	}

    }

}
