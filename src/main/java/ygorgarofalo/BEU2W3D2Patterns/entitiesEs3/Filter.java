package ygorgarofalo.BEU2W3D2Patterns.entitiesEs3;

public abstract class Filter {

    private Filter nextFilter;

    public abstract void check(int amount);


    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }


    public void next(int amount) {
        if (nextFilter != null) {
            nextFilter.check(amount);
        } else {
            System.out.println("Siamo arrivati alla fine della catena, nessuno percepisce almeno questo stipendio");
        }
    }
}

