package esercizio2;

public class Main {
    public static void main(String[] args) {
	int[] array = new int[3000];

	for (int i = 0; i < array.length; i++) {
	    array[i] = (int) ((Math.random() * 100) + 1);
	}

	int[] a1 = new int[1000];
	int[] a2 = new int[1000];
	int[] a3 = new int[1000];

	for (int i = 0; i < a1.length; i++) {
	    a1[i] = array[i];
	}

	int tot1 = 0;
	int tot2 = 0;
	int tot3 = 0;

	for (int i = 0; i < a1.length; i++) {
	    tot1 += a1[i];
	    tot2 += a2[i];
	    tot3 += a3[i];
	}

	long start = System.nanoTime();

	ArrayCalculator ac1 = new ArrayCalculator(a1);
	ArrayCalculator ac2 = new ArrayCalculator(a2);
	ArrayCalculator ac3 = new ArrayCalculator(a3);

	Thread t1 = new Thread(ac1);
	Thread t2 = new Thread(ac2);

	t1.start();
	t2.start();
	ac3.run();

	try {
	    t1.join();
	    t2.join();
	    int tot = ac1.getTotale() + ac2.getTotale() + ac3.getTotale();
	    System.out.println(tot);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	long end = System.nanoTime();
	System.out.println(end - start);
    }

}
