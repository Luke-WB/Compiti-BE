package conguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Franchise {
    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2F shirt() {

	double prezzo = 21.99;
	return new Esercizio2F("la maglietta ha il prezzo di: " + prezzo + "€");
    }

    @Bean
    @Scope("singleton") // singleton --> RITORNA QUALCOSA COL SYSTEMOUT
    public Esercizio2F mug() {

	double prezzo = 4.99;
	return new Esercizio2F("la tazza ha il prezzo di: " + prezzo + "€");
    }
}
