package hw13.coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Michael");
        coffeeOrderBoard.add("Dorian");
        coffeeOrderBoard.add("Mary");
        coffeeOrderBoard.add("Elza");
        coffeeOrderBoard.add("Salma");
        System.out.println("-----------------------------------------------------------------");

        coffeeOrderBoard.draw();
        System.out.println("-----------------------------------------------------------------");

        coffeeOrderBoard.deliver();
        int numberToRemove = 3;
        coffeeOrderBoard.deliver(numberToRemove);
        System.out.println("-----------------------------------------------------------------");

        coffeeOrderBoard.draw();
        System.out.println("-----------------------------------------------------------------");

    }
}
