import javaGame.ComputerUser;
import javaGame.HumanUser;
import javaGame.RockPaperScissorsGame;


public class Main {
    public static void main(String[] args) {

        HumanUser user = new HumanUser();
        HumanUser user1 = new HumanUser();
//        ComputerUser user = new ComputerUser();
//        ComputerUser user1 = new ComputerUser();

        RockPaperScissorsGame game = new RockPaperScissorsGame();

        game.playGame(user,user1);

    }
}