package hw11.task_1;

public class Wall extends Obstacle {
    public Wall(String name, double height) {
        super(name, height);
    }

    @Override
    public void overcome(Participant participant) {
        if (value <= participant.jumpingRestrictions) {
            System.out.println(participant.jumping(value) + "over the " + name + ".");
        } else {
            System.out.println("Participant " + participant.name + " did NOT jumped " + value + " meters over the " + name + ". Passed 0 meters.");
        }
    }
}


