package bo;
import exceptions.*;
//import java.util.ArrayList;

public class Zoo {

    protected Manager dir;
    private int nbAnimals;
    protected Animal[] tabAnimals;
    
    //private int nbAnimals;
    //protected ArrayList<Animal> alAnimal;
    
    public Zoo(Manager dir, int nbMax) {
        this.dir = dir;
        this.nbAnimals = 0;
        this.tabAnimals = new Animal[nbMax];

        //alAnimal = new ArrayList<>();
    }

    public boolean add(Animal a) throws FullZooException, AlreadyDeadException {

        if (nbAnimals >= tabAnimals.length) {
            throw new FullZooException("The zoo is full, cannot add more animals.");
        }

        if (a.getAge() >= a.getAgeMax()) {
            throw new AlreadyDeadException(a.getName() + " is already dead.");
        }

        tabAnimals[nbAnimals++] = a;
        return true;
        
         //alAnimal.add(a);
        //nbAnimals++;
        //return true;
    }

    public boolean remove(Animal a) throws EmptyZooException {

        if (nbAnimals == 0) {
            throw new EmptyZooException("The zoo is empty, cannot remove any animals.");
        }

        for (int i = 0; i < nbAnimals; i++) {
            if (tabAnimals[i].equals(a)) {
                tabAnimals[i] = tabAnimals[--nbAnimals];
                tabAnimals[nbAnimals] = null;
                return true;

            //if (alAnimal.remove(a)) {
            //nbAnimals--;
            //return true;
            }
        }
        return false;
    }

    public void feedAnimal() throws EmptyZooException {

        if (nbAnimals == 0) {
            throw new EmptyZooException("The zoo is empty, there are no animals to feed.");
        }

        for (int i = 0; i < nbAnimals; i++) {
            System.out.println(tabAnimals[i].eat());

        //for (Animal animal : alAnimal) {
            //System.out.println(animal.eat());
        }
    }

    public void birthZoo() throws EmptyZooException, AlreadyDeadException {

        if (nbAnimals == 0) {
            throw new EmptyZooException("The zoo is empty, no animals to age.");
        }

        for (int i = 0; i < nbAnimals; i++) {
            tabAnimals[i].getOlder();

        //for (Animal animal : alAnimal) {
            //animal.getOlder();
        }
    }

    public void listZoo() throws EmptyZooException {

        if (nbAnimals == 0) {
            throw new EmptyZooException("The zoo is empty, no animals to display.");
        }

        for (int i = 0; i < nbAnimals; i++) {
            System.out.println(tabAnimals[i].toString());

        //for (Animal animal : alAnimal) {
            //System.out.println(animal.toString());
        }
    }

}