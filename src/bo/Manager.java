package bo;
import bo.Zoo;

public class Manager {
    protected String name;
    protected int ysSeniority;

    public Manager(String name, int ysSeniority) {
        this.name = name;
        this.ysSeniority = ysSeniority;
    }

    public int getYsSeniority() {
        return ysSeniority;
    }

    public void setYsSeniority(int ysSeniority) {
        this.ysSeniority = ysSeniority;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Manager [name=" + name + ", ysSeniority=" + ysSeniority + "]";
    }
}