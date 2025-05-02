import javaGame.ComputerUser;
import javaGame.HumanUser;
import javaGame.RockPaperScissorsGame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HumanUser user = new HumanUser();
        ComputerUser computerUser = new ComputerUser();
        RockPaperScissorsGame game = new RockPaperScissorsGame();

        game.playGame(user,computerUser);

    }
}