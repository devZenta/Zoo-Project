package go;
import bo.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {

        try {

            Manager manager = new Manager("Zenta", 10); 
            Zoo zoo = new Zoo(manager, 10); 
        
            Animal bird = new Bird("Parrot", 2, 3, "Squawk", "Green");
            Animal cat = new CatLike("Lion", 4, 15, "Roar", "Yellow");
            Animal monkey = new Monkey("Chimpanzee", 5, 40, "Ooh ooh ah ah");

            zoo.add(bird);
            zoo.add(cat);
            zoo.add(monkey);

            zoo.listZoo();
            zoo.feedAnimal();
            zoo.birthZoo();
            
        } catch (FullZooException | EmptyZooException | AlreadyDeadException e) {
            System.err.println(e.getMessage());
        }
        
    }
}