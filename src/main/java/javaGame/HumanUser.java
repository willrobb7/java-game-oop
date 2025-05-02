package javaGame;

import java.util.Scanner;

public class HumanUser extends User{

    private Scanner user_input = new Scanner(System.in);

    @Override
    protected void setName(){
        System.out.println("Please enter your name");
        this.name = user_input.nextLine();
    }


    @Override
    protected void setChoice() {
        while (true) {
            System.out.println("Pick rock, paper or scissors");
            String userInput = user_input.nextLine().toUpperCase();
            try {
                this.choice = RockPaperScissorsChoices.valueOf(userInput);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice, please type 'rock', 'paper' or 'scissors'");
            }
        }
    }
}
