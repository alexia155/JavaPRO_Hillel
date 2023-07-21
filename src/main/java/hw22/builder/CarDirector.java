package hw22.builder;

public class CarDirector {
    public Car buildCarBMW(CarBuilder builder) {
        return builder.setProducer("BMW")
                .setModel("BMW X2 sDrive18i M Sport")
                .setYear(2019)
                .setColor("Gray")
                .setBody("4360 × 1824 × 1526")
                .setEngine("gasoline (1499 cm³)")
                .setTransmission("robotic (7 steps)")
                .build();
    }
}
