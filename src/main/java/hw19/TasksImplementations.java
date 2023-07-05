package hw19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.text.DecimalFormat;

public class TasksImplementations {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 273.56, true, LocalDate.parse("2023-07-04")));
        products.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        products.add(new Product("Book", 73, false, LocalDate.parse("2023-05-19")));
        products.add(new Product("Book", 369.99, true, LocalDate.parse("2016-12-05")));
        products.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        //result 1 - first task
        System.out.println("--------------All books with the price > 250 USD: --------------");
        List<Product> result1 = getBooksWithTheLimitedPrice(products);
        result1.forEach(System.out::println);

        //result 3 - third task
        System.out.println("--------------The cheapest book: --------------");
        try {
            Product theCheapestBook = getTheCheapestBooks(products);
            System.out.println(theCheapestBook);
        } catch (NoSuchElementException error) {
            System.out.println(error.getMessage());
        }

        //result 4 - fourth task
        System.out.println("--------------The three most recently added products: --------------");
        List<Product> result4 = getTheLastThreeAddedProducts(products);
        result4.forEach(System.out::println);

        //result 5 - fifth task
        System.out.println("--------------The total cost of newly added books, which prices don't exceed 75 USD: --------------");
        double result5 = calculateTheTotalBooksCost(products);
        System.out.println(result5);

        //result 2 - second task
        System.out.println("--------------Books with the 10% discount: --------------");
        List<Product> result2 = getBooksWithDiscount(products);
        result2.forEach(System.out::println);
    }

    public static List<Product> getBooksWithTheLimitedPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> getBooksWithDiscount(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(Product::isDiscountPossibility)
                .map(product -> {
                    double priceWithDiscount = product.getPrice() * 0.9;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    double formattedPriceWithDiscount = Double.parseDouble(decimalFormat.format(priceWithDiscount));
                    product.setPrice(formattedPriceWithDiscount);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public static Product getTheCheapestBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("There is no books in the base!"));
    }

    public static List<Product> getTheLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddedDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double calculateTheTotalBooksCost(List<Product> products) {
        LocalDate currentDate = LocalDate.now();

        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .filter(product -> product.getAddedDate().getYear() == currentDate.getYear())
                .mapToDouble(Product::getPrice)
                .sum();
    }

}
