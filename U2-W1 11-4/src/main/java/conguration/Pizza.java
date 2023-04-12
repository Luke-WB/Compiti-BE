package conguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cOmpito110423.cOmpito110423.esercizio2p;

@Configuration
public class Pizza {
    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public esercizio2p margherita_pizza() {
	Toppings ham = Toppings.HAM;
	Toppings ham2 = Toppings.CHEESE;

	int calorie = 1104;
	double prezzo = 4.99;
	return new esercizio2p("la pizza margherita (" + ham2 + " " + ham + "). " + " ha calorie: " + calorie + "kc e "
		+ "il prezzo è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public esercizio2p hawaiian_pizza() {
	Toppings ham = Toppings.HAM;
	Toppings ham2 = Toppings.CHEESE;
	Toppings ham3 = Toppings.TOMATO;
	Toppings ham4 = Toppings.PINEAPPLE;

	int calorie = 1024;
	double prezzo = 6.99;
	return new esercizio2p("la pizza hawaiian (" + ham2 + " " + ham3 + " " + ham4 + " " + ham + "). "
		+ " ha calorie: " + calorie + "kc e " + "il prezzo è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public esercizio2p salami_pizza() {
	Toppings ham = Toppings.TOMATO;
	Toppings ham2 = Toppings.CHEESE;
	Toppings ham3 = Toppings.SALAMI;

	int calorie = 1160;
	double prezzo = 5.99;
	return new esercizio2p("la pizza salami (" + ham2 + " " + ham3 + " " + ham + "). " + " ha calorie: " + calorie
		+ "kc e " + "il prezzo è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public esercizio2p family_size_for_pizza() {
	Toppings ham = Toppings.HAM;
	Toppings ham2 = Toppings.CHEESE;

	double calorie = 1.95;
	double prezzo = 4.15;
	return new esercizio2p(
		"la pizza family size for" + " ha calorie: x" + calorie + "kc e " + "il prezzo è: +" + prezzo + "€");
    }
}
