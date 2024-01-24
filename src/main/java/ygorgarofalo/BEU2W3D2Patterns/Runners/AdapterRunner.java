package ygorgarofalo.BEU2W3D2Patterns.Runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ygorgarofalo.BEU2W3D2Patterns.entities.Adapter;
import ygorgarofalo.BEU2W3D2Patterns.entities.DataSource;
import ygorgarofalo.BEU2W3D2Patterns.entities.Info;
import ygorgarofalo.BEU2W3D2Patterns.entities.UserData;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        Info info = new Info();
        info.setNome("Aldo");
        info.setCognome("Baglio");
        info.setDataDiNascita(LocalDate.of(1980, 02, 12));

        // nel runner istanzio un nuovo Adapter e passo una istanza di info nel suo contructor
        // assegno come tipo di dato DataSource perchè Adapter implementa la sua interfaccia
        DataSource dataSource = new Adapter(info);


        // uso userData per ottenere i dati che mi servono
        UserData userData = new UserData();
        userData.getData(dataSource);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
