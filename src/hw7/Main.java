package hw7;

public class Main {
    public static void main(String[] args) {

        SubscriberServiceImpl subscriberService = new SubscriberServiceImpl();
        Subscriber[] subscribers = SubscriberGeneration.generateSub();

        subscriberService.checkSubByCityCallDur(subscribers, 100);
        subscriberService.checkSubByInterCityCallDur(subscribers);
        subscriberService.checkSubByLasName(subscribers, 'A');
        subscriberService.calcCityInternetTraffic(subscribers,"Kyiv");
        subscriberService.calcNumberNegativeBalanceSub(subscribers);
    }
}
