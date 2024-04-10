import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.util.Objects;
public class Booking {
    private Client client;
    private int nbClients;
    private LocalTime arrivalTime;
    private List<Dish> orders = new ArrayList<Dish>();
    public Booking(Client client, int nbClients, LocalTime arrivalTime) {
        this.client = client;
        this.nbClients = nbClients;
        this.arrivalTime = arrivalTime;
    }
    public void addDish(Dish dish,int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.orders.add(dish);
        }
    }
    public double getBill() {
        double bill = 0;
        for (Dish order : orders) {
            bill += order.getPrice();
        }
        return bill;
    }
    public String toString() {
        String totalString = "";
        totalString += ("Reservation de " + this.client.name + "(" + Objects.toString(nbClients) + " personnes) \n");
        for (Dish order : orders) {
            totalString += (order.toString() + "\n");
        }
        totalString += ("Total : " + Objects.toString(this.getBill()) + " euros\n");
        return totalString;
    }
}
