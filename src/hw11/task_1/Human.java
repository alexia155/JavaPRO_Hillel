package hw11.task_1;

public class Human extends Participant {
    public Human(String name, double runningRestrictions, double jumpingRestrictions) {
        super(name, runningRestrictions, jumpingRestrictions);
    }

    @Override
    public String running(double distance) {
        return "Participant " + name + " ran " + distance + " meters";
    }

    @Override
    public String jumping(double height) {
        return "Participant " + name + " jumped " + height + " meters ";
    }
}