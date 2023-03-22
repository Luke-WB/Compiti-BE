package esercizio2;

public class ArrayCalculator implements Runnable {
    private int[] array;
    private int tot;

    public ArrayCalculator(int[] a) {
	this.array = a;
    }

    @Override
    public void run() {

    }

    public void totale() {
	int tot = 0;

	for (int i = 0; i < array.length; i++) {
	    tot += array[i];
	}
	this.tot = tot;
	// return tot;
    }

    public int getTotale() {
	return this.tot;
    }
}
