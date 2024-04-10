public class Drink {
    private final String name;
    private double price;
    private final boolean isAlcoholic;
    public Drink(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean isAlcoholic(){
        return this.isAlcoholic;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        if (this.isAlcoholic){
            return this.name + ", " +this.price + " , alcoholic";
        }
        return this.name + ", " +this.price + ", non-alcoholic";
    }
}
