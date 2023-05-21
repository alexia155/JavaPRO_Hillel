package hw7;

public class SubscriberGeneration {
    public static Subscriber[] generateSub() {
        Subscriber[] array = new Subscriber[10];
        array[0] = new Subscriber(1, "Adams", "Noah", "Kyiv", 456789159, 59602, 45, 126, 45, 564);
        array[1] = new Subscriber(2, "Wilson", "Amelia", "Kherson", 458365214, 63025, -54.6, 348, 58, 79);
        array[2] = new Subscriber(3, "Burton", "George", "Lviv", 789658148, 15874, 100, 54, 0, 410);
        array[3] = new Subscriber(4, "Harris", "Lily", "Kyiv", 365485951, 47896, 67.3, 4, 61, 306);
        array[4] = new Subscriber(5, "Stevens", "Oliver", "Kharkiv", 201604558, 59632, 4, 38, 14, 511);
        array[5] = new Subscriber(6, "Robinson", "Sophia", "Kherson", 478100258, 45201, -59, 206, 0, 78);
        array[6] = new Subscriber(7, "Lewis", "Muhammad", "Kyiv", 602200356, 60054, 50, 368, 41, 600);
        array[7] = new Subscriber(8, "Walker", "Rosie", "Lviv", 895559620, 96002, 65.23, 56, 125, 481);
        array[8] = new Subscriber(9, "Payne", "Arthur", "Kherson", 555203468, 20258, -12.4, 14, 0, 304);
        array[9] = new Subscriber(10, "Baker", "Aria", "Kyiv", 365200147, 5870, 14, 148, 6, 89);
        return array;
    }
}
