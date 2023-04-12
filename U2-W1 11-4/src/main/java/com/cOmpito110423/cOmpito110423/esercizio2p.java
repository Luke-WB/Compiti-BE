package com.cOmpito110423.cOmpito110423;

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
public class esercizio2p {

    private String name;
    // private String surname;

    public String saluta() {
	return name;
    }

}
