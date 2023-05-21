package hw7;

import java.util.Objects;

public class SubscriberServiceImpl implements SubscriberService{
    @Override
    public void checkSubByCityCallDur(Subscriber[] subscribers, int duration){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Subscribers, whose city calls time exceeds " + duration + ": ");

        for (Subscriber sub : subscribers) {
            if(sub.getCityCallDur() > duration){
                System.out.println(sub);
            }
        }
    }
    @Override
    public void checkSubByInterCityCallDur(Subscriber[] subscribers){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Subscribers, whose has inter city calls: ");

        for (Subscriber sub : subscribers) {
            if(sub.getInterCityCallDur() > 0){
                System.out.println(sub);
            }
        }
    }
    @Override
    public void checkSubByLasName(Subscriber[] subscribers, char firstLetter){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Subscribers, whose last names start with " + firstLetter + ": ");

        for (Subscriber sub : subscribers) {
            String lastName = sub.getLastName();
            char firstChar = lastName.charAt(0);

            if(firstChar == firstLetter){
                System.out.println("Subscriber: " + sub.getLastName() + " " + sub.getFirstName() + "; Phone number: " + sub.getPhoneNumber() + "; Current balance: " + sub.getBalance());
            }
        }
    }
    @Override
    public void calcCityInternetTraffic(Subscriber[] subscribers, String city){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Total consumption of Internet traffic for " + city + " (GB): ");
        double trafficSum = 0;

        for (Subscriber sub : subscribers) {
            if(Objects.equals(sub.getCity(), city)){
               trafficSum += sub.getInternetTraffic();
            }
        }
        System.out.println(trafficSum);
    }
    @Override
    public void calcNumberNegativeBalanceSub(Subscriber[] subscribers){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Number of subscribers with a negative balance: ");
        int sum = 0;

        for (Subscriber sub : subscribers) {
            if(sub.getBalance() < 0){
                sum += 1;
            }
        }
        System.out.println(sum);
    }

}
