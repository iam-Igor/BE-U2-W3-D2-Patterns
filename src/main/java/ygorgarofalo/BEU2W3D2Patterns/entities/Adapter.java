package ygorgarofalo.BEU2W3D2Patterns.entities;

import java.time.LocalDate;

public class Adapter implements DataSource {

    //creo una classe che funga da adattatore tra le classi info e userData, che
    //implementa l'interfaccia dataSource, questa classe accetta una istanza di Info
    // nel suo contructor.


    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }


    // calcolo dell'età:  ottengo l'anno di nascita di info poi sottraggo l'anno corrente all'anno di nascita
    // faccio un cast in int per ritornare una età.
    @Override
    public int getEta() {
        if (info.getDataDiNascita() != null) {
            long annoDiNascita = info.getDataDiNascita().getYear();
            long etaInAnni = LocalDate.now().getYear() - annoDiNascita;
            return (int) etaInAnni;
        } else {
            return 0;
        }
    }
}
