package ygorgarofalo.BEU2W3D2Patterns.entitiesEs3;

public abstract class Filter {

    // riferimento al prossimo filtro della catena
    private Filter nextFilter;

    public abstract void check(int amount);


    // imposto il prossimo filtro nella catena
    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }


    //metodo per gestire i filtri nella catena, nel metodo check passo l'importo

    public void next(int amount) {
        if (nextFilter != null) {
            nextFilter.check(amount);
        } else {
            System.out.println("Siamo arrivati alla fine della catena, nessuno percepisce almeno questo stipendio");
        }
    }
}

