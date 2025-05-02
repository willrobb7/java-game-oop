package javaGame;

public class RockPaperScissorsGame implements Game {

    public void playGame(User user1, User user2) {
        user1.setName();
        user2.setName();

        System.out.println("Hello " + user1.getName() + " and " + user2.getName());
        System.out.println("Rock Paper Scissors Game started! You have 3 tries to beat each other");
        System.out.println("----------------");

        for (int i = 0; i < 3; i++) {
            if (user1 instanceof HumanUser) {
                System.out.println(user1.getName() + ", it's your turn.");
            }
            user1.setChoice();

            if (user2 instanceof HumanUser) {
                System.out.println(user2.getName() + ", it's your turn.");
            }
            user2.setChoice();

            RockPaperScissorsChoices choice1 = user1.getChoice();
            RockPaperScissorsChoices choice2 = user2.getChoice();

            System.out.println(user1.getName() + " chose: " + choice1);
            System.out.println(user2.getName() + " chose: " + choice2);

            if (choice1.equals(choice2) && i == 2) {
                System.out.println("It's a draw, and you're out of attempts! Better luck next time");
                System.out.println("----------------");
                break;
            } else if (choice1.equals(choice2)) {
                System.out.println("It's a draw");
                System.out.println("----------------");
            } else if (choice1.beats(choice2)) {
                System.out.println(user1.getName() + " wins!");
                break;
            } else {
                System.out.println(user2.getName() + " wins!");
                break;
            }
        }
    }
}