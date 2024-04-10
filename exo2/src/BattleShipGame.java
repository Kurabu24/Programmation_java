import java.util.ArrayList;

public class BattleShipGame{
    ArrayList<BattleShip> battlelist = new ArrayList<BattleShip>();
    int numOfGuesses;
    private GameHelper helper = new GameHelper();
    public void setUpGame(){
        BattleShip Nina = new BattleShip();
        BattleShip pinta = new BattleShip() ; 
        BattleShip SantaMaria = new BattleShip();
        battlelist.add(Nina);
        battlelist.add(pinta);
        battlelist.add(SantaMaria);
        System.out.println("Your goal is to sink three boats: Nina, Pinta,Santa Monica");
        for (BattleShip j: battlelist){
            ArrayList<String> newLocation = helper.placeBattleShip(3);
            j.locationCells = newLocation;
            System.out.println(j.locationCells);
        }
    }
    private void checkUserGuess(String userGuess){
        String result = "";
        for (BattleShip i :battlelist){
            i.result = i.checkYourself(userGuess);
            if (i.result == "sunk"){
                battlelist.remove(i);
                break;
            }
            if (result == "hit"){
                break;
            }
        }
        System.out.println(result);
    }
    public void startPlaying(){
        while (! battlelist.isEmpty()){
            String userGuess = helper.getUserInput("enter a guess : ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    public void finishGame(){
        System.out.println("all boats are sunk, here is the number of tries : " + numOfGuesses);
    }
  }