package hw6;

public class Cat extends Animals {
    public static int cat_count = 0;

    public Cat (int runningLimit, int swimmingLimit, String name) {
        super(runningLimit, swimmingLimit, name);
        cat_count += 1;
    }

    public static void swim() {
        System.out.println("Cats can't swim!");
    }
}