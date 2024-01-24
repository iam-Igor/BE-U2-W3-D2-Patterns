package ygorgarofalo.BEU2W3D2Patterns.entities;

import java.time.LocalDate;

public class Adapter implements DataSource {

    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

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
