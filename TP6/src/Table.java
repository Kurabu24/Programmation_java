import java.util.Objects;
public class Table {
    private int id;
    private int capacity;
    public Table(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    public int getId() {
        return id;
    }
    public int getCapacity() {
        return capacity;
    }
    public String toString() {
        return ("Table " + Objects.toString(this.id) + " (" + Objects.toString(this.capacity) + " places) ");
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Table table = (Table) o;
        return id == table.id &&
                capacity == table.capacity;
    }
    public int hashCode() {
        return Objects.hash(id);
    }
}
