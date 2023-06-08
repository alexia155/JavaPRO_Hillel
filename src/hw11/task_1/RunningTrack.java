package hw11.task_1;

public class RunningTrack extends Obstacle {
    public RunningTrack(String name, double value) {
        super(name, value);
    }

    @Override
    public void overcome(Participant participant) {
        if (value <= participant.runningRestrictions) {
            System.out.println(participant.running(value) + "on the " + name + ".");
        } else {
            System.out.println("Participant " + participant.name + " did NOT run " + value + " meters on the " + name + ". Passed 0 meters.");
        }
    }
}