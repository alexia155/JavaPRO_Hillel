package hw6;

public class Dog extends Animals {
    public static int dog_count = 0;

    public Dog(int runningLimit, int swimmingLimit, String name) {
        super(runningLimit, swimmingLimit, name);
        dog_count += 1;
    }

}
