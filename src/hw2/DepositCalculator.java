package hw2;

public class DepositCalculator {
    static double newPercentage;
    static double firstResult;
    static double amountPerMonth;
    static double interestPerMonth;
    static double percentagePerMonth;
    static double secondResult;
    static double yearAmount;
    static double thirdResult;
    static double amountFinal;
    static double count;

    public static void main(String[] args) {

        System.out.println("This is the Deposit Calculator.");
        System.out.println("""
                Enter data into the program. Please follow the sequence of data introduction: \s
                1. the amount of the cash deposit (UA)
                (Attention! there will be only one contribution); \s
                2. annual percentage paid by the bank; \s
                3. deposit duration. \s
                ---------------------------------------------------------""");
        double deposit = Double.parseDouble(args[0]);
        double percentage = Double.parseDouble(args[1]);
        double duration = Double.parseDouble(args[2]);

        newPercentage = percentage / 100;

        firstResult = percentEveryMonth(deposit, newPercentage);
        secondResult = amountPerYear(deposit, newPercentage);
        thirdResult = finalAmount(deposit, newPercentage, duration);

        System.out.println("The percentage with capitalization for one month is " + String.format("%.2f", firstResult) + "%.");
        System.out.println("The accumulated amount for the one year is " + String.format("%.2f", secondResult) + " hryvnias.");
        System.out.println("The total accumulated amount in the very end is " + String.format("%.2f", thirdResult) + " hryvnias.");
    }

    //метод рахує складний відсоток з капіталізацією за один місяць. Формула: сума вкладу * (1 + відсоток /12)
    private static double percentEveryMonth(double deposit, double newPercentage) {
        amountPerMonth = (deposit * (1 + newPercentage / 12));
        interestPerMonth = amountPerMonth - deposit;
        percentagePerMonth = (interestPerMonth * 100) / deposit;
        return percentagePerMonth;
    }

    //метод рахує повну накопичену суму за один рік. Формула: сума вкладу * (1 + відсоток)
    private static double amountPerYear(double deposit, double newPercentage) {
        yearAmount = deposit * (1 + newPercentage);
        return yearAmount;
    }

    //метод рахує повну накопичену під кінець. Формула: сума вкладу * (1 + відсоток) ^ тривалість вкладу
    private static double finalAmount(double deposit, double newPercentage, double duration) {
        count = 1 + newPercentage;
        amountFinal = deposit * Math.pow(count, duration);
        return amountFinal;
    }
}

