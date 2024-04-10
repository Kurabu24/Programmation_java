public class Client {
    private String firstName;
    private String lastName;
    private int age;
    static final int DRINKING_AGE = 18;
    public Client(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public boolean canDrinkAlcohol(){
        if (this.age >= DRINKING_AGE){
            return true;
        }
        return false;
    }
    public String toString(){
        return this.firstName + " " + this.lastName +" ("+ this.age +") \n";
    }

}
