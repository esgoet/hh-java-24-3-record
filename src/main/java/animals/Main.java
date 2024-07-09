package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // animals.Owner
        Owner ownerKarl = new Owner("Karl", 54, "Berlin");

        // animals.Species
        Species giraffeSpecies = new Species("Giraffe", 2500);
        Species wolfSpecies = new Species("Wolf", 1700);
        Species dogSpecies = new Species("Dog", 800);

        // animals.Animal

        Animal giraffe = new Animal(1, "Clara", giraffeSpecies, 7, ownerKarl);
        Animal wolf = new Animal(2, "Peter", wolfSpecies, 5, ownerKarl);
        Animal wolfCopy = new Animal(2, "Peter", wolfSpecies, 5, ownerKarl);
        Animal wolf2 = new Animal(3, "Felix", wolfSpecies, 2, ownerKarl);
        Animal dog = new Animal(4, "Cookie", dogSpecies, 12, new Owner("Lisa", 23, "Hamburg"));

        // Output
        System.out.println(giraffe); //Output: animals.Animal[id=1, name=Clara, species=Giraffe, age=7, owner=animals.Owner[name=Karl, age=54, address=Berlin]]
        System.out.println(dog); //Output: animals.Animal[id=4, name=Cookie, species=Dog, age=12, owner=animals.Owner[name=Lisa, age=23, address=Hamburg]]
        System.out.println(wolf.equals(dog)); //Output: false

        System.out.println(wolf.species().equals(wolf2.species())); //Output: true
        System.out.println(wolfCopy.equals(wolf)); //Output: true

        System.out.println(giraffe.owner().equals(wolf.owner())); // Output: true
        System.out.println(giraffe.owner().address().equals(dog.owner().address())); // Output: false

        // animals.Zoo
        List<Animal> animals = new ArrayList<>(Arrays.asList(giraffe, wolf, wolf2, dog));
        Zoo zoo = new Zoo(animals);
        System.out.println("Total Daily Required Food in Grams: " + zoo.calculateTotalFoodRequired());


    }
}
