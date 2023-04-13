package it.epicode.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Tavolo {
    private final Integer numero;
    private final Integer numeroMassimoCoperti;
    private Boolean occupato = false;

}
