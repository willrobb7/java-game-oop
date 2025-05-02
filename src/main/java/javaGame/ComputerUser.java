package javaGame;

import java.util.Random;

public class ComputerUser extends User{


    // In this example, it isn't implementing a method that's declared as abstract in the super class
    // We are just replacing the method that's defined in the super class
    @Override
    public void whoAmI(){
        System.out.println("something different to the super class");
    }

    @Override
    protected void setName(){
        this.name = "Puter";
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
