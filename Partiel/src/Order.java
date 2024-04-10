public class Order {
    static final int MAX_SIZE = 10;
    static int orderCount ;
    Client client;
    private Drink[] orderedDriks;
    int numberOfDriks;
    private final int id;
    public Order(Client client){
        this.client = client;
        this.orderCount  = 0;
        this.orderedDriks = new Drink[MAX_SIZE];
        this.numberOfDriks = 0;
        this.id = orderCount;
    }
    public boolean add(Drink drink){
        if (this.numberOfDriks < MAX_SIZE){
         if (drink.isAlcoholic()){
            if (this.client.canDrinkAlcohol()){
                this.orderedDriks[this.numberOfDriks] = drink;
                this.numberOfDriks++;
                return true;
            }
            return false;
         }
         this.orderedDriks[this.numberOfDriks] = drink;
         this.numberOfDriks++;
         return true;
        }
        return false;
    }
    public double getTotalPrice(){
        double totalPrice = 0;
        for (int i = 0; i < this.numberOfDriks; i++){
            totalPrice += this.orderedDriks[i].getPrice();
        }
        return totalPrice;
    }
    public void display(){
        System.out.println(this.client.toString());         
        for (int i = 0; i < this.numberOfDriks; i++){
            System.out.println(orderedDriks[i].toString() +","+ orderedDriks[i].getPrice() + " \n");
        }
        System.out.println(getTotalPrice());
    }
    public static Order cheeperOrder(Order order1,Order order2){
        if(order1.getTotalPrice() > order2.getTotalPrice()){
            return order2;
        }
        return order1;
    }
}
