import java.util.List;
import java.util.ArrayList;
public class People {
    // instances of this class :
    public List<People> followers;
    private String name;
    private List<Message> messages;
    People(String name){
        this.name = name;
        this.followers = new ArrayList<People>();
        this.messages = new ArrayList<Message>();
    }
    // getters and setters :
    public String getName() {return name;}
    public Message lastPost(){
        return messages.get(messages.size()-1);
    }
    // like a message (be displayed in others likers list) :
    public void like(Message message){
        message.receiveLike(this);
    }
    // add people to followers list :
    private void addFollower(People people){
        followers.add(people);
    }
    public void receive(Message message){
        messages.add(message);
    }
    private void broadcast(Message message){
        for(People people : followers){
            people.receive(message);
        }
    }
    // people's followers list add this
    public void follow(People people){
        people.addFollower(this);
    }
    public void post (String title, String content){
        Message postMessage = new Message(this);
        postMessage.setAuthor(this);
        postMessage.setTitle(title);
        postMessage.setContent(content);
        messages.add(postMessage);
        broadcast(postMessage);
    }
    public void display(){
        System.out.println("Page de : "+ this.getName()+"\n");
        for(Message message : messages){
            System.out.println(message.getTitle()+"\n par :" + message.getAuthor().getName()+"\n"+message.getContent());
            System.out.println("Aime par :");
            message.displayLikers();
            System.out.println("\n     ---------    ");

        }
    }
}