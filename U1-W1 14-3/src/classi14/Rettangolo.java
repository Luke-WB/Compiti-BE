package classi14;

public class Rettangolo {
    int altezza;
    int larghezza;

    public Rettangolo(int a, int b) {
	this.altezza = a;
	this.larghezza = b;

    }

    public int perimetro() {
	return (altezza * 2) + (larghezza * 2);
    }

    public int area() {
	return altezza * larghezza;
    }

    public static void stampaRettangolo(Rettangolo r) {
	System.out.println(r.area());
	System.out.println(r.perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r, Rettangolo rr) {
	System.out.println("l'area 1 è: " + r.area() + " l'area 2 è: " + rr.area());
	System.out.println("il perimetro 1 è: " + r.perimetro() + " il perimetro 2 è: " + rr.perimetro());
	System.out.println("l'area totale è: " + (r.area() + rr.area()));
	System.out.println("il perimetro totale è: " + (r.perimetro() + rr.perimetro()));
    }

} // PARENTESI CLASSE