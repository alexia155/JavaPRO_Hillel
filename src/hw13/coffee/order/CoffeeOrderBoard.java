package hw13.coffee.order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeOrderBoard {
    private Map<Integer, Order> orderBoard;
    private int orderNumber;

    public CoffeeOrderBoard() {
        orderBoard = new HashMap<>();
        orderNumber = 1;
    }

    public void add(String name) {
        Order order = new Order(orderNumber, name);
        orderBoard.put(orderNumber, order);
        orderNumber++;
        System.out.println("New order added to the 'Coffee Order Board':      " + order + ".");
    }

    public void deliver() {
        int firstKey = orderBoard.keySet().iterator().next();
        System.out.println("Order ready: " + orderBoard.get(firstKey));
        orderBoard.remove(firstKey);
    }

    public void deliver(int numberToRemove) {
        if(orderBoard.containsKey(numberToRemove)){
            Order order = orderBoard.get(numberToRemove);
            System.out.println("The ready order by number: " + order + ".");
            orderBoard.remove(numberToRemove);
        }
        else{
            System.out.println("Now there's no ready order.");
        }
    }

    public List<Order> draw() {
        List<Order> orderList = new ArrayList<>();

        System.out.println("Coffee Order Board:");
        System.out.println("    #    |    Order    ");

        for (int i = 0; i <= orderBoard.size() + 2; i++) {
            Order order = orderBoard.get(i);
            if (order != null) {
                System.out.println("    " + (i + 1) + "    |    " + order);
                orderList.add(order);
            }
        }

        return orderList;
    }
    }






