package hw11.task_1;

public class Main {
    public static void main(String[] args) {
        Participant[] participant = new Participant[3];
        participant[0] = new Human("Lila", 3000, 1);
        participant[1] = new Cat("Matt", 300, 0.5);
        participant[2] = new Robot("Robby", 6000, 2.5);

        Obstacle[] obstacle = new Obstacle[3];
        obstacle[0] = new RunningTrack("running track", 1000);
        obstacle[1] = new Wall("wall #1", 0.5);
        obstacle[2] = new Wall("wall #2", 1.3);

        passEachObstacle(participant, obstacle);
    }

    public static void passEachObstacle(Participant[] participant, Obstacle[] obstacle) {
        for (Participant participants : participant) {
            for (Obstacle obstacles : obstacle) {
                obstacles.overcome(participants);
            }
            System.out.println("-------------------------------------------------------");
        }
    }
}
