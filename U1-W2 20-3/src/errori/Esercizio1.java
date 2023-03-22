package errori;

import java.util.Scanner;

public class Esercizio1 {
    int arrayElem[] = new int[5];
    int max = 10;
    int min = 1;
    int range = max - min + 1;
    Scanner sc = new Scanner(System.in);

    public Esercizio1() {
	while (true) {

	    try {
		Elem();

	    } catch (Exception e) {
		System.out.println("input non valido");
		break;
	    }

	}

    };

    public void Elem() throws Exception {

	arrayElem[0] = (int) (Math.random() * range);
	arrayElem[1] = (int) (Math.random() * range);
	arrayElem[2] = (int) (Math.random() * range);
	arrayElem[3] = (int) (Math.random() * range);
	System.out.println("inserire valore da 1 a 10");
	arrayElem[4] = sc.nextInt();
	if (arrayElem[4] <= 0) {
	    throw new Exception("uscita e");
	}
	System.out.println(arrayElem[0]);
	System.out.println(arrayElem[1]);
	System.out.println(arrayElem[2]);
	System.out.println(arrayElem[3]);
    }
};
