package utils;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "events")
@Getter
@Setter
@ToString
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "dataevento")
    private String dataevento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipoevento")
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoevento;

    @Column(name = "numeromassimopartecipanti")
    private int numeromassimopartecipanti;

}