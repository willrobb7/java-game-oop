package javaGame;


public class RockPaperScissorsGame implements Game{

    public void playGame(User user, ComputerUser computerUser) {
        user.setName();
        System.out.println("Hello, " + user.getName());
        System.out.println("Rock Paper Scissors Game started! You have 3 tries to beat the computer");
        System.out.println("----------------");

        for (int i = 0; i < 3; i++) {
            computerUser.setChoice();
            user.setChoice();

            RockPaperScissorsChoices playerChoice = user.getChoice();
            RockPaperScissorsChoices computersChoice = computerUser.getChoice();

            System.out.println("You chose: " + playerChoice);
            System.out.println("Computer chose: " + computersChoice);

            if (playerChoice.equals(computersChoice) && i == 2) {
                System.out.println("It's a draw, and you're out of attempts! Better luck next time");
                System.out.println("----------------");
                break;
            } else if (playerChoice.equals(computersChoice)) {
                System.out.println("It's a draw");
                System.out.println("----------------");
            } else if (playerChoice.beats(computersChoice)) {
                System.out.println("You Win!");
                break;
            } else {
                if (i != 2) {
                    System.out.println("You Lose this round, try again");
                    System.out.println("----------------");
                } else {
                    System.out.println("----------------");
                    System.out.println("You Lose! Better luck next time");
                    System.out.println("----------------");
                }
            }
        }
    }

}
