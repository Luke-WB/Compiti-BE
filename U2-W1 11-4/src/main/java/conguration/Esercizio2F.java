package conguration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Esercizio2F {
    private String name;
    // private String surname;

    public String saluta() {
	return name;
    }
}
