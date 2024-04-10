import java.util.Objects;
public class Dish {
    private String name;
    private double price;
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return (this.name + " (" + Objects.toString(this.price) + " euros) ");
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Dish dish = (Dish) o;
        return price == dish.price;
    }
    public int hashCode() {
        return Objects.hash(price);
    }
    
}
