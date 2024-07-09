public class Main {
    public static void main(String[] args) {
        Animal giraffe = new Animal(1, "Clara", "Giraffe", 7);

        Animal wolf = new Animal(2, "Peter", "Wolf", 5);
        Animal wolfCopy = new Animal(2, "Peter", "Wolf", 5);
        Animal wolf2 = new Animal(3, "Felix", "Wolf", 2);

        Animal dog = new Animal(4, "Cookie", "Dog", 12);

        System.out.println(giraffe); //Output: Animal[id=1, name=Clara, species=Giraffe, age=7]
        System.out.println(wolf.equals(dog)); //Output: false
        System.out.println(wolf.species().equals(wolf2.species())); //Output: true
        System.out.println(wolfCopy.equals(wolf)); //Output: true
    }
}
