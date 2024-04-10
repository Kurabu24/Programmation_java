import java.util.*;
public class BattleShip{
    public ArrayList<String> locationCells = new ArrayList<String>();
    public String name;
    void setName(String name){
        this.name = name;
    }
    public String result = "missed";
  
    public String checkYourself(String guess){
      for (String i :locationCells){
        if (guess == i ){
            this.result = "hit";
            locationCells.remove(i);
            if (locationCells.size() == 0){
                this.result = "sunk";
            }
        }
      }
      return this.result;
    }
  
    public void setLocationCells(ArrayList<String> location){
      locationCells = location;
    }
  }
  