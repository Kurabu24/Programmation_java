import java.util.List;
import java.util.ArrayList;
public class Message {
    // Constructor and instance :
    private People author;
    private String title;
    private String content;
    private List<People> likers;
    Message(People author){
        this.author = author;
        this.likers = new ArrayList<People>();
    }
    //getters and setters::
    public People getAuthor() {return author;}
    public void setAuthor(People author) {this.author = author;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    // add people to likers list :
    public void receiveLike(People people){
        likers.add(people);
    }
    public void displayLikers(){
        for(People people : likers){
            System.out.println(people.getName());
        }
    }
}