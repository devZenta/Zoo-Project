package bo;

public class CatLike extends Animal{
    protected String race;

    public CatLike(String race, String name, int age, int ageMax, String shout) {
        super(name, age, ageMax, shout);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "CatLike{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ageMax=" + ageMax +
                ", shout='" + shout + '\'' +
                ",}";
            }
}