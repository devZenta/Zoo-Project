package bo;

public class Bird extends Animal {
    protected String color;

    public Bird(String name, int age, int ageMax, String shout, String color) {
        super(name, age, ageMax, shout);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ageMax=" + ageMax +
                ", shout='" + shout + '\'' +
                ",}";
    }
}