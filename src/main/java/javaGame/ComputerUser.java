package javaGame;

import java.util.Random;

public class ComputerUser extends User{


    @Override
    protected void setName(){
        this.name = "Computer";
    }

    @Override
    protected void setChoice(){
        Random random = new Random();
        int pick = random.nextInt(3); // 0, 1 or 2
            if (pick == 0) {
                this.choice = RockPaperScissorsChoices.ROCK;
            } else if (pick == 1) {
                this.choice = RockPaperScissorsChoices.PAPER;
            } else {
                this.choice = RockPaperScissorsChoices.SCISSORS;
            }
        }
}
