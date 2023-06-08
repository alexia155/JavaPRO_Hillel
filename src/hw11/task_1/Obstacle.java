package hw11.task_1;
abstract class Obstacle {

    protected String name;
    protected double value;
    public Obstacle(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public abstract void overcome(Participant participant);

}