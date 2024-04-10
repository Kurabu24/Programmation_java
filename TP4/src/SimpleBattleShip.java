import java.lang.Integer;
public class SimpleBattleShip {
    int [] locationCells = new int[3];
    int numOfHits = 0;
    public String checkYourself(String guess){
        int userGuess =  Integer.parseInt(guess);
        for(int i :locationCells){
            if (userGuess == i){
                numOfHits++;
                if (numOfHits == 3){
                    return "sunk";
                }
                return "hit";
            }
        }
        return "missed";
    }
    public void setLocationCells(int [] locationCells){
        this.locationCells = locationCells;
    }
}
