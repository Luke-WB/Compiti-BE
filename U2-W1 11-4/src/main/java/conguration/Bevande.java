package conguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cOmpito110423.cOmpito110423.Esercizio2B;

@Configuration
public class Bevande {

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2B lemonade() {
	double litri = 0.33;

	int calorie = 128;
	double prezzo = 1.29;
	return new Esercizio2B("la limonata " + "(" + litri + "l) " + " ha calorie: " + calorie + "kc e "
		+ "il prezzo è: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2B water() {
	double litri = 0.5;

	int calorie = 0;
	double prezzo = 1.29;
	return new Esercizio2B("l'acqua " + "(" + litri + "l) " + " ha calorie: " + calorie + "kc e " + "il prezzo è: "
		+ prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2B wine() {
	double litri = 0.75;

	int calorie = 607;
	double prezzo = 7.49;
	return new Esercizio2B("il vino " + "(" + litri + "l, 13% ) " + " ha calorie: " + calorie + "kc e "
		+ "il prezzo è: " + prezzo + "€");
    }
}
