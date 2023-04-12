package conguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cOmpito110423.cOmpito110423.Esercizio2;

@Configuration
public class ConfigurationTest {

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2 prosciutto() {
	Toppings ham = Toppings.HAM;
	int calorie = 35;
	double prezzo = 0.99;
	return new Esercizio2(
		"il " + ham + " ha calorie: " + calorie + "kc e " + "il prezzo in più è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2 salami() {
	Toppings ham = Toppings.SALAMI;
	int calorie = 86;
	double prezzo = 0.99;
	return new Esercizio2(
		"il " + ham + " ha calorie: " + calorie + "kc e " + "il prezzo in più è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2 pineapple() {
	Toppings ham = Toppings.PINEAPPLE;
	int calorie = 24;
	double prezzo = 0.79;
	return new Esercizio2(
		"il " + ham + " ha calorie: " + calorie + "kc e " + "il prezzo in più è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2 cheese() {
	Toppings ham = Toppings.CHEESE;
	int calorie = 92;
	double prezzo = 0.69;
	return new Esercizio2(
		"il " + ham + " ha calorie: " + calorie + "kc e " + "il prezzo in più è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2 onion() {
	Toppings ham = Toppings.ONION;
	int calorie = 22;
	double prezzo = 0.69;
	return new Esercizio2(
		"il " + ham + " ha calorie: " + calorie + "kc e " + "il prezzo in più è: " + prezzo + "€");
    }

}
