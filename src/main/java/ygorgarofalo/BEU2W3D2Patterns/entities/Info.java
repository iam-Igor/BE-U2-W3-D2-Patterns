package ygorgarofalo.BEU2W3D2Patterns.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@Setter
@ToString
public class Info {

    private String nome;

    private String cognome;

    private LocalDate dataDiNascita;


}
