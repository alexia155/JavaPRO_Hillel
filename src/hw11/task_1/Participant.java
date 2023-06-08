package hw11.task_1;

abstract class Participant {
    protected String name;
    protected double runningRestrictions;
    protected double jumpingRestrictions;

    public Participant(String name, double runningRestrictions, double jumpingRestrictions) {
        this.name = name;
        this.runningRestrictions = runningRestrictions;
        this.jumpingRestrictions = jumpingRestrictions;
    }

    public abstract String running(double distance);

    public abstract String jumping(double height);
}