import java.util.ArrayList;
public class BattleShip {
    ArrayList<String> locationCells = new ArrayList<String>();
    String name ;
    public void setName(String name) {
        this.name = name;
    }
    public String checkYourself(String guess){
        String result = "missed";
        String removedCell = null;
        for(String cell : locationCells){
            if(cell.equals(guess)){
                removedCell = cell;
                if (locationCells.size() == 1){
                    result = "sunk";
                }
                else {
                    result = "hit";
                }
            }
        }
        locationCells.remove(removedCell);
        return result;
    }
    public void setLocationCells(ArrayList<String> locationCells){
        this.locationCells = locationCells;
    }
}
