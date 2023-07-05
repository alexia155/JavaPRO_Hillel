package hw19;
import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private String type;
    private double price;
    private boolean discountPossibility;
    private LocalDate addedDate;

    public Product(String type, double price, boolean discountPossibility, LocalDate addedDate) {
        this.type = type;
        this.price = price;
        this.discountPossibility = discountPossibility;
        this.addedDate = addedDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountPossibility() {
        return discountPossibility;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPossibility(boolean discountPossibility) {
        this.discountPossibility = discountPossibility;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && discountPossibility == product.discountPossibility && Objects.equals(type, product.type) && Objects.equals(addedDate, product.addedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, discountPossibility, addedDate);
    }

    @Override
    public String toString() {
        return "Product{" +
               "type='" + type + '\'' +
               ", price=" + price +
               ", discountPossibility=" + discountPossibility +
               ", addedDate=" + addedDate +
               '}';
    }
}
