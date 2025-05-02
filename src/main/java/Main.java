import javaGame.ComputerUser;
import javaGame.HumanUser;
import javaGame.RockPaperScissorsGame;


public class Main {
    public static void main(String[] args) {

        HumanUser user = new HumanUser();
        ComputerUser computerUser = new ComputerUser();
        RockPaperScissorsGame game = new RockPaperScissorsGame();

        game.playGame(user,computerUser);

    }
}