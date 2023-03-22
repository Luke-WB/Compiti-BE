package classi14;

public class Runnable {
    public static void main(String[] args) {

	Rettangolo uno = new Rettangolo(10, 12);
	Rettangolo due = new Rettangolo(4, 5);
	Rettangolo.stampaRettangolo(uno);
	Rettangolo.stampaDueRettangoli(uno, due);

	Sim miaSim = new Sim("+39 320 4409332");

	miaSim.setCreditoDisponibile(10);

	Chiamata chiamata = new Chiamata("+39 339 3234567", 3);
	miaSim.getListaChiamate()[0] = chiamata;

	chiamata = new Chiamata("+39 335 234556", 5);
	miaSim.getListaChiamate()[1] = chiamata;

	chiamata = new Chiamata("+39 320 8832445", 7);
	miaSim.getListaChiamate()[2] = chiamata;

	miaSim.stampaDati();

	Cliente cUno = new Cliente(12335, "banana", "pompelmo", "frutta@gmail.com", "12-12-23");

	Articolo aUno = new Articolo(0, null, 0, 0);
	aUno.setCodiceArticolo(122222);
	aUno.setDescrizioneArticolo("spazzola");
	aUno.setPrezzo(12.25);
	Articolo.setNumeroPezziInMagazzino(55);

	System.out.println("I pezzi sono: " + aUno.getNumeroPezziInMagazzino() + " il codice articolo è: "
		+ aUno.getCodiceArticolo() + " l'articolo in questione è " + aUno.getDescrizioneArticolo()
		+ " il prezzo dell'articolo è: €" + aUno.getPrezzo());
	System.out.println("il codice cliente è: " + cUno.getCodiceCliente() + " il nome è: " + cUno.getNome()
		+ " il cognome è: " + cUno.getCognome() + " la email è:" + cUno.getEmail() + " la datas è: "
		+ cUno.getDataIscrizione());
	System.out.println("okokokokok");
    }

}