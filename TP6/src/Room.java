import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class Room {
    static private int nbTables = 0;
    private ArrayList<Table> tables = new ArrayList<Table>();
    private final Map<Table, Booking> bookedTables = new HashMap<>();
    private ArrayList<Dish> menu = new ArrayList<Dish>();
    public void addDish(Dish dish) {
        this.menu.add(dish);
    }
    public void addTable(int capacity) {
        this.nbTables ++;
        Table table = new Table(nbTables, capacity);
        this.tables.add(table);

    }
    private Table findAppopriatTable(int nbPeople){
        ArrayList<Table> goodTables = new ArrayList<Table>();
        for (Table table : this.tables) {
            if(table.getCapacity() >= nbPeople) goodTables.add(table);
        }
        if (goodTables.size() == 0) return null;
        ArrayList<Integer> goodTableSizes = new ArrayList <>();
        for(Table goodtable : goodTables){
            goodTableSizes.add(goodtable.getCapacity());
        }
        Table bestTable = goodTables.get(goodTableSizes.indexOf(Collections.min(goodTableSizes)));
        return bestTable;
    }
    public Table bookTable(Client client, int nbPeople, LocalTime arrivalTime) {
        Table bestTable = findAppopriatTable(nbPeople);
        if (bestTable == null) return null;
        this.bookedTables.put(bestTable, new Booking(client, nbPeople, arrivalTime));
        this.tables.remove(bestTable);
        return bestTable;
    }
    public void addOrder(Dish dish, Table table){
        this.bookedTables.get(table).addDish(dish, 1);
    }
    public void addOrder(Dish dish, int quantity, Table table){
        this.bookedTables.get(table).addDish(dish, quantity);
    }
    public String toString() {
        String room = "";
        for (Map.Entry<Table, Booking> entry : this.bookedTables.entrySet()) {
            room += entry.getKey() + "\n";
            room += entry.getValue() + "\n";
        }
        room += "---------------------\n";
        for (Table table : this.tables) {
            room += table + "vide\n";
        }
        return room;
    }
}
