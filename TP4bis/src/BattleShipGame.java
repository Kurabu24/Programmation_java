import java.util.*;
public class BattleShipGame {
    ArrayList<BattleShip> battleList = new ArrayList<BattleShip>();
    int numOfGuesses = 0;
    private GameHelper helper = new GameHelper();
    public void setUpGame(){
        BattleShip boat1 = new BattleShip();
        BattleShip boat2 = new BattleShip();
        BattleShip boat3 = new BattleShip();
        boat1.setName("Nina");
        boat2.setName("Pinta");
        boat3.setName("SantaMaria");
        battleList.add(boat1);
        battleList.add(boat2);
        battleList.add(boat3);
        System.out.println("your goal is to sink three ships :" + boat1.name + "," + boat2.name + "," + boat3.name);
        for(BattleShip boat : battleList){
            ArrayList<String> newLocation = helper.placeBattleShip(3);
            boat.setLocationCells(newLocation);
        }
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        BattleShip removedShip = null;
        String result = "missed";
        for (BattleShip boat : battleList){
        result = boat.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            else if (result.equals("sunk")){
                removedShip = boat;
                break;
            }
        }
        if (removedShip!= null){
            battleList.remove(removedShip);
        }
        System.out.println(result);
    }
        private void startPlaying(){
            while (!battleList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess’");
            checkUserGuess(userGuess);
            }
            finishGame();
        }
        private void finishGame(){
            System.out.println("all the boats have been sunk, here is the num of guesses :" + numOfGuesses);
        }
    public static void main(String[] args) {
        BattleShipGame game = new BattleShipGame();
        game.setUpGame();
        game.startPlaying();
    }
}
