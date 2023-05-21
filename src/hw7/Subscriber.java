package hw7;

public class Subscriber {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private int phoneNumber;
    private int contractNumber;
    private double balance;  //UA
    private int cityCallDur;  //min
    private int interCityCallDur;  //min
    private int internetTraffic;  //GB

    public Subscriber(int id, String lastName, String firstName, String city, int phoneNumber, int contractNumber, double balance, int cityCallDur, int interCityCallDur, int internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallDur = cityCallDur;
        this.interCityCallDur = interCityCallDur;
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getCityCallDur() {
        return cityCallDur;
    }

    public int getInterCityCallDur() {
        return interCityCallDur;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setContractNumber(int contactNumber) {
        this.contractNumber = contactNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCityCallDur(int cityCallDur) {
        this.cityCallDur = cityCallDur;
    }

    public void setInterCityCallDur(int interCityCallDur) {
        this.interCityCallDur = interCityCallDur;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber " +
               "id= " + id +
               "; lastName= '" + lastName + '\'' +
               "; firstName= '" + firstName + '\'' +
               "; city= '" + city + '\'' +
               "; phoneNumber= " + phoneNumber +
               "; contactNumber= " + contractNumber +
               "; balance= " + balance +
               "; cityCallDur= " + cityCallDur +
               "; interCityCallDur= " + interCityCallDur +
               "; internetTraffic= " + internetTraffic +
               '.';
    }
}
