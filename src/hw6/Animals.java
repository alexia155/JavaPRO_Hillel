package hw6;
import java.util.Scanner;

public class Animals {
    private final int runningLimit;
    private final int swimmingLimit;
    private final String name;
    public static int animals_count = 0;

    public Animals(int runningLimit, int swimmingLimit, String name) {
        this.runningLimit = runningLimit;
        this.swimmingLimit = swimmingLimit;
        this.name = name;
        animals_count += 1;
    }

    public static int scannerDistanceToRun() {
        Scanner distanceToRun = new Scanner(System.in);
        System.out.println("Set distance to run for cats and dogs: ");
        return distanceToRun.nextInt();
    }

    public static int scannerDistanceToSwim() {
        Scanner distanceToSwim = new Scanner(System.in);
        System.out.println("Set distance to swim for cats and dogs: ");
        return distanceToSwim.nextInt();
    }

    public void run(int runDistance) {
        if(runDistance > this.runningLimit){
            System.out.println(this.name + " cannot run more than " + this.runningLimit + " meters!");
        }
        else{
            System.out.println(this.name + " run " + runDistance + " meters.");
        }
    }

    public void swim(int swimDistance) {
        if(swimDistance > this.swimmingLimit){
            System.out.println(this.name + " cannot swim more than " + this.swimmingLimit + " meters!");
        }
        else{
            System.out.println(this.name + " swam " + swimDistance + " meters.");
        }
    }
}
