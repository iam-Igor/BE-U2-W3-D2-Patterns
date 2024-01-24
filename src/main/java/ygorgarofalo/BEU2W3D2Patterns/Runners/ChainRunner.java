package ygorgarofalo.BEU2W3D2Patterns.Runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ygorgarofalo.BEU2W3D2Patterns.entitiesEs3.*;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonello colonello = new Colonello();
        Generale generale = new Generale();

        capitano.setNextFilter(maggiore);
        maggiore.setNextFilter(colonello);
        colonello.setNextFilter(generale);
        generale.setNextFilter(tenente);

        System.out.println("------ES 3 CHAIN---------");
        capitano.check(2000);


    }
}
