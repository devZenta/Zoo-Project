package go;

import bo.*;

public class Main {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Zenta", 10); 
        Zoo zoo = new Zoo(manager, 10); 
        
        Animal bird = new Bird("Parrot", 2, 5, "Squawk", "Green");
        Animal cat = new CatLike("Lion", 4, 15, "Roar", "Yellow");
        Animal monkey = new Monkey("Chimpanzee", 5, 40, "Ooh ooh ah ah");

        zoo.add(bird);
        zoo.add(cat);
        zoo.add(monkey);

        System.out.println("Listing all animals in the zoo:");
        zoo.listZoo();

        System.out.println("\nFeeding all animals in the zoo:");
        zoo.feedAnimal();

        System.out.println("\nSimulating the passage of one year:");
        zoo.birthZoo();

        System.out.println("\nListing all animals in the zoo after one year:");
        zoo.listZoo();
    }
}