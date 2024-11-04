package bo;

public class Zoo {
    protected Manager dir;
    private int nbAnimals;
    protected Animal[] tabAnimals;

    public Zoo(Manager dir, int nbMax) {
        this.dir = dir;
        this.nbAnimals = 0;
        this.tabAnimals = new Animal[nbMax];
    }

    public boolean add(Animal an) {

        if (nbAnimals >= tabAnimals.length) {
            System.out.println("Zoo is full, cannot add more animals.");
            return false;
        }

        if (an.getAge() > an.getAgeMax()) {
            System.out.println(an.getName() + " is too old to be added to the zoo.");
            return false;
        }

        tabAnimals[nbAnimals] = an;
        nbAnimals++;
        System.out.println(an.getName() + " has been added to the zoo.");
        return true;
    }

    public boolean remove() {
        if (nbAnimals > 0) {
            Animal lastAnimal = tabAnimals[nbAnimals - 1];
            
            System.out.println("Removing " + lastAnimal.getName() + " from the zoo.");
            
            tabAnimals[nbAnimals - 1] = null;
            
            nbAnimals--;
            
            return true;
        } else {
            System.out.println("Zoo is empty, no animal to remove.");
            return false;
        }
    }

    public void birthZoo() {
        int i = 0;
        while (i < nbAnimals) {
            Animal animal = tabAnimals[i];
            
            if (!animal.getOlder()) { 
                System.out.println(animal.getName() + " has died and will be removed from the zoo.");
            
                for (int j = i; j < nbAnimals - 1; j++) {
                    tabAnimals[j] = tabAnimals[j + 1];
                }
                
                tabAnimals[nbAnimals - 1] = null;
                
                nbAnimals--;
            } else {
                i++;
            }
        }
    }

    public void feedAnimal() {
        for (int i = 0; i < nbAnimals; i++) {
            Animal animal = tabAnimals[i];
            System.out.println(animal.eat());
        }
    }

    public void listZoo() {
        System.out.println("Zoo Director: " + dir.getName());
        
        for (int i = 0; i < nbAnimals; i++) {
            Animal animal = tabAnimals[i];
            System.out.println("Animal Name: " + animal.getName() + ", Age: " + animal.getAge() + 
                               ", Shout: " + animal.getShout());
        }
    }

}