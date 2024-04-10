import java.time.LocalTime;
public class App {
    public static void main(String[] args) throws Exception {
        Dish dish1 = new Dish("Pieds de paquets",18.50);
        Dish dish2 = new Dish("bouillabaisse",30);
        Client client1 = new Client("Marius");
        Room room = new Room();
        room.addDish(dish1);
        room.addDish(dish2);
        room.addTable(4);
        room.addTable(3);
        room.addTable(2);
        room.addTable(1);
        Table clientTAble = room.bookTable(client1, 2, LocalTime.of(20,0));
        room.addOrder(dish2,clientTAble );
        room.addOrder(dish1, 2, clientTAble);
        System.out.println(room.toString());

    }
}
