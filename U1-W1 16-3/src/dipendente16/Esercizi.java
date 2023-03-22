package dipendente16;

public class Esercizi {

    public static void main(String[] args) {
	// ESERCIZIO #1

	Dipendente a = new Dipendente(1000, 12345, 2000, 20, Livello.OPERAIO, Dipartimento.PRODUZIONE);
	Dipendente b = new Dipendente(1000, 45678, 2000, 20, Livello.IMPIEGATO, Dipartimento.PRODUZIONE);
	Dipendente c = new Dipendente(1000, 91011, 2000, 20, Livello.QUADRO, Dipartimento.PRODUZIONE);
	Dipendente d = new Dipendente(1000, 12134, 2000, 20, Livello.DIRIGENTE, Dipartimento.PRODUZIONE);

	System.out.println(a.promuovi());
	System.out.println(a.stampaDatiDipendente());
	System.out.println(a.calcolaPaga(2));

	System.out.println(b.promuovi());
	System.out.println(b.stampaDatiDipendente());
	System.out.println(b.calcolaPaga(3));

	System.out.println(c.promuovi());
	System.out.println(c.stampaDatiDipendente());
	System.out.println(c.calcolaPaga(4));

	System.out.println(d.promuovi());
	System.out.println(d.calcolaPaga(5));
	System.out.println(d.stampaDatiDipendente());

	// ESERCIZIO #2

    }

}
