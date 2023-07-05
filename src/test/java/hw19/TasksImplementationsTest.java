package hw19;
import hw17.SimpleMathLibrary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TasksImplementationsTest {
    @DisplayName("#getBooksWithTheLimitedPrice")
    @Test
    void getBooksWithTheLimitedPrice() {
        List<Product> incoming = new ArrayList<>();
        incoming.add(new Product("Book", 273.56, true, LocalDate.parse("2023-07-04")));
        incoming.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        incoming.add(new Product("Book", 73, false, LocalDate.parse("2023-05-19")));
        incoming.add(new Product("Book", 369.99, true, LocalDate.parse("2016-12-05")));
        incoming.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        List<Product> result = TasksImplementations.getBooksWithTheLimitedPrice(incoming);

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(273.56, result.get(0).getPrice());
        Assertions.assertEquals(369.99, result.get(1).getPrice());
    }

    @DisplayName("#getBooksWithDiscount")
    @Test
    void getBooksWithDiscount() {
        List<Product> incoming = new ArrayList<>();
        incoming.add(new Product("Book", 273.56, true, LocalDate.parse("2023-07-04")));
        incoming.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        incoming.add(new Product("Book", 73, false, LocalDate.parse("2023-05-19")));
        incoming.add(new Product("Book", 369.99, true, LocalDate.parse("2016-12-05")));
        incoming.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        List<Product> result = TasksImplementations.getBooksWithDiscount(incoming);

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(246.2, result.get(0).getPrice());
        Assertions.assertEquals(332.99, result.get(1).getPrice());
    }

    @DisplayName("#getTheCheapestBooks - with no exceptions")
    @Test
    void getTheCheapestBooks_NO_Exception() {
        List<Product> incoming = new ArrayList<>();
        incoming.add(new Product("Book", 273.56, true, LocalDate.parse("2023-07-04")));
        incoming.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        incoming.add(new Product("Book", 73, false, LocalDate.parse("2023-05-19")));
        incoming.add(new Product("Book", 369.99, true, LocalDate.parse("2016-12-05")));
        incoming.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        Product result = TasksImplementations.getTheCheapestBooks(incoming);
        Product expected = new Product("Book", 73.0, false, LocalDate.parse("2023-05-19"));

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("#getTheCheapestBooks - with the exception")
    @Test
    void getTheCheapestBooks_Exception() {
        List<Product> incoming = new ArrayList<>();
        incoming.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        incoming.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        Throwable exception = assertThrows(NoSuchElementException.class, () -> TasksImplementations.getTheCheapestBooks(incoming));
        Assertions.assertEquals("There is no books in the base!", exception.getMessage());
    }

    @DisplayName("#getTheLastThreeAddedProducts")
    @Test
    void getTheLastThreeAddedProducts() {
        List<Product> incoming = new ArrayList<>();
        incoming.add(new Product("Book", 273.56, true, LocalDate.parse("2023-07-04")));
        incoming.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        incoming.add(new Product("Book", 73, false, LocalDate.parse("2023-05-19")));
        incoming.add(new Product("Book", 369.99, true, LocalDate.parse("2016-12-05")));
        incoming.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        List<Product> result = TasksImplementations.getTheLastThreeAddedProducts(incoming);

        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Book", result.get(0).getType());
        Assertions.assertEquals("Book", result.get(1).getType());
        Assertions.assertEquals("Sharpener", result.get(2).getType());
    }

    @Test
    void calculateTheTotalBooksCost() {
        List<Product> incoming = new ArrayList<>();
        incoming.add(new Product("Book", 273.56, true, LocalDate.parse("2023-07-04")));
        incoming.add(new Product("Pen", 38, false, LocalDate.parse("2003-04-14")));
        incoming.add(new Product("Book", 73, false, LocalDate.parse("2023-05-19")));
        incoming.add(new Product("Book", 369.99, true, LocalDate.parse("2016-12-05")));
        incoming.add(new Product("Sharpener", 111.89, true, LocalDate.parse("2020-02-20")));

        List<Product> result = TasksImplementations.getTheLastThreeAddedProducts(incoming);

        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Book", result.get(0).getType());
        Assertions.assertEquals("Book", result.get(1).getType());
        Assertions.assertEquals("Sharpener", result.get(2).getType());
    }
}