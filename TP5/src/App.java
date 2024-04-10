public class App {
    public static void main(String[] args) throws Exception {
        People alice = new People("Alice");
        People bob = new People("Bob");
        People carol = new People("Carol");
        alice.post("Mon premier message",
        "bonjour à tous !");
        bob.follow(alice);
        carol.like(alice.lastPost());
        alice.post("Mon second message",
        "je vous aime.");
        bob.like(alice.lastPost());
        carol.like(alice.lastPost());
        bob.post("test test",
        "test");
        alice.post("À propos de Bob",
        "quel boulet celui-là.");
        carol.like(alice.lastPost());
        bob.post("Réponse à Alice",
        "t'as un problème???");
        bob.display();

    }
}
