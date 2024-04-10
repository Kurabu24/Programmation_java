public class App {
    public static void main(String[] args) throws Exception {
        Client emilie = new Client("Emilie","Roux",33);
        Client marc = new Client("Marc","Rail",19);
        Drink coca = new Drink("Coca-Cola",2.45,false);
        Drink mojito = new Drink("Mojito",1.99,true);
        Drink cappuccino = new Drink("Cappuccino",1.99,false);
        Drink JD = new Drink("JD",1.99,false);
        Order order1 = new Order(emilie);
        Order order2 = new Order(marc);
        System.out.println(order1.add(coca));
        System.out.println(order1.add(mojito));
        System.out.println(order2.add(cappuccino));
        System.out.println(order2.add(JD));
        System.out.println(order1.getTotalPrice());
        System.out.println(order2.getTotalPrice());
        Order.cheeperOrder(order1,order2).display();
    }
}
