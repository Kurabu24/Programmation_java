public class SimpleBattleShipGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleBattleShip boat = new SimpleBattleShip();
        int randomNum = (int)(Math.random() *5);
        int [] locations ={randomNum,randomNum +1,randomNum +2};
        boat.setLocationCells(locations);
        Boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("enter a number between 1 and 7: ");
            String result = boat.checkYourself(guess);
            System.out.println(result);
            numOfGuess++;
            if (result.equals("sunk")){System.out.println("the boat sunk this is the num of guesses :" + numOfGuess);}
            
        }

    }
}
