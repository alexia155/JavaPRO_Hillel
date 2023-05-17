package hw6;

public class Main {
    public static void main(String[] args) {
        int runDistance = Animals.scannerDistanceToRun();
        int swimDistance = Animals.scannerDistanceToSwim();

        Dog bob = new Dog(500, 10, "Bob");
        Cat bagira = new Cat(200, 0, "Bagira");

        System.out.println("\n" + "-------- DOGS --------");
        bob.run(runDistance);
        bob.swim(swimDistance);

        System.out.println("\n" + "-------- CATS --------");
        bagira.run(runDistance);
        Cat.swim();

        System.out.println("\n" + "Number of all animals: " + Animals.animals_count );
        System.out.println("Number of all cats: " + Cat.cat_count);
        System.out.println("Number of all dogs: " + Dog.dog_count );
    }
}
