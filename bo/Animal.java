package bo;

public class Animal {
    protected String name;
    protected int age;
    protected int ageMax;
    protected String shout;
    
    public Animal(String name, int age, int ageMax, String shout) {
        this.name = name;
        this.age = age;
        this.ageMax = ageMax;
        this.shout = shout;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public String getShout() {
        return shout;
    }

}