package bo;

public class Zoo {
    protected Manager dir;
    protected int nbAnimals;
    protected Animal[] tabAnimals;

    public Zoo(Manager dir, int nbMax, String name, int age, int ageMax, String shout) {
        this.dir = dir;
    }
}