package classi14;

public class Articolo {
    long codiceArticolo;
    String descrizioneArticolo;
    double prezzo;
    private static int numeroPezziInMagazzino;

    public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziInMagazzino) {
	this.codiceArticolo = codiceArticolo;
	this.descrizioneArticolo = descrizioneArticolo;
	this.prezzo = prezzo;
	this.numeroPezziInMagazzino = numeroPezziInMagazzino;

    };

    public long getCodiceArticolo() {
	return codiceArticolo;
    };

    public void setCodiceArticolo(long codiceArticolo) {
	this.codiceArticolo = codiceArticolo;
    };

    public String getDescrizioneArticolo() {
	return descrizioneArticolo;
    };

    public void setDescrizioneArticolo(String descrizioneArticolo) {
	this.descrizioneArticolo = descrizioneArticolo;
    };

    public double getPrezzo() {
	return prezzo;
    };

    public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
    };

    public int getNumeroPezziInMagazzino() {
	return numeroPezziInMagazzino;
    };

    public static void setNumeroPezziInMagazzino(int numeroPezziInMagazzino) {
	Articolo.numeroPezziInMagazzino = numeroPezziInMagazzino;
    }

} // PARENTESI ARTICOLO
