package ygorgarofalo.BEU2W3D2Patterns.entitiesEs3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ufficiale extends Filter {
    private String grado;
    private int stipendio;


    public Ufficiale(String rank, int salary) {
        this.grado = rank;
        this.stipendio = salary;
    }

    @Override
    public void check(int amount) {
        if (amount >= stipendio) {
            System.out.println(grado + " percepisce almeno questo stipendio");
        } else {
            next(amount);
        }
    }
}
