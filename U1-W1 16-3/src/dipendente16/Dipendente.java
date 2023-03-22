package dipendente16;

public class Dipendente {
    public static double stipendioBase = 1000.00;
    private static String stipendioMensile;
    private int matricola;
    private static double stipendio;
    public static double importoOrarioStraordinario = 20;
    private Livello livello;
    private Dipartimento dipartimentoBase;

    public Dipendente(int matricola, Dipartimento dipartimento) {
	this.matricola = matricola;
	this.dipartimentoBase = dipartimento;
	this.stipendio = stipendioBase;
	this.importoOrarioStraordinario = 30;
	this.livello = Livello.OPERAIO;
    };

    public Dipendente(double stipendioBase, int matricola, double stipendio, double importoOrarioStraordinario,
	    Livello livello, Dipartimento dipartimento) {
	this.matricola = matricola;
	this.stipendioBase = stipendioBase;
	this.stipendio = stipendio;
	this.importoOrarioStraordinario = importoOrarioStraordinario;
	this.livello = livello;
	this.dipartimentoBase = dipartimento;
    };

    public String stampaDatiDipendente() {
	return ("Lo stipendio base è: €" + getStipendioBase() + ", Il codice matricola è: " + getMatricola()
		+ ", Lo stipendio totale è: €" + getStipendio() + " ,l'oraio extra è pagato a: €"
		+ getImportoOrarioStraordinario() + " ,Il livello è: " + livello
		+ " ,Il dipartimento in cui lavora è:  " + dipartimentoBase);

    };

    public Livello promuovi() {
	if (livello == livello.OPERAIO) {
	    this.livello = livello.IMPIEGATO;
	    this.stipendio = stipendioBase * 1.2;
	} else if (livello == livello.IMPIEGATO) {
	    this.livello = livello.QUADRO;
	    this.stipendio = stipendioBase * 1.5;
	} else if (livello == livello.QUADRO) {
	    this.livello = livello.DIRIGENTE;
	    this.stipendio = stipendioBase * 2;
	} else if (livello == livello.DIRIGENTE) {
	    System.out.print("HAI RAGGIUNTO IL LIVELLO MAX -> ");
	}
	return livello;
    };

    public static String calcolaPaga(int ore) {

	importoOrarioStraordinario = ore * 20;
	return stipendioMensile = "Lo stipendio totale mensile è: €" + (stipendio + importoOrarioStraordinario);
    };

    public double getStipendioBase() {
	return stipendioBase;
    }

    public int getMatricola() {
	return matricola;
    }

    public double getStipendio() {
	return stipendio;
    }

    public Livello getLivello() {
	return livello;
    }

    public Dipartimento getDipartimento() {
	return dipartimentoBase;
    }

    public double getImportoOrarioStraordinario() {
	return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double straordinario) {
	this.importoOrarioStraordinario = straordinario;
    }

}
