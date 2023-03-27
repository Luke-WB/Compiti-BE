package esercizi;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Product a1 = new Product("Horror", "Books", 120);
	Product a2 = new Product("Avengers", "Film", 90);
	Product a3 = new Product("Yellow", "Books", 90);
	Product a4 = new Product("Bimbo", "Baby", 150);
	Product a5 = new Product("Bimba", "Baby", 20);

	List<Product> prodotti = new ArrayList<Product>();
	prodotti.add(a1);
	prodotti.add(a2);
	prodotti.add(a3);
	prodotti.add(a4);
	prodotti.add(a5);

	List<Product> ordini = new ArrayList<Product>();
	prodotti.add(a1);
	prodotti.add(a2);
	prodotti.add(a3);
	prodotti.add(a4);
	prodotti.add(a5);

	Logger logger = Logger.getLogger("com.api.jar");

	List<Product> resultArr = prodotti.stream().filter(x -> x.getCategory().equals("Books") && x.getPrice() > 100)
		.collect(Collectors.toList());

	System.out.println(resultArr.toString());

	List<Product> resultOrd = ordini.stream().filter(x -> x.getCategory().equals("Baby"))
		.collect(Collectors.toList());
	System.out.println(resultOrd.toString());

	Order o1 = new Order(resultOrd);
	System.out.println(o1.toString());

    }

}
