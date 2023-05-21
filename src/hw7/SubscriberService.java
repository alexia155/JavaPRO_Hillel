package hw7;

public interface SubscriberService {
    void checkSubByCityCallDur(Subscriber[] subscribers, int duration);
    void checkSubByInterCityCallDur(Subscriber[] subscribers);
    void checkSubByLasName(Subscriber[] subscribers, char firstLetter);
    void calcCityInternetTraffic(Subscriber[] subscribers, String city);
    void calcNumberNegativeBalanceSub(Subscriber[] subscribers);

}
