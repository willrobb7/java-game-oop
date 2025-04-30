package javaGame;

import java.util.Scanner;

public class HumanUser extends User{

    private Scanner user_input = new Scanner(System.in);

    // In this example, it isn't implementing a method that's declared as abstract in the super class
    // We are just replacing the method that's defined in the super class
    @Override
    public void whoAmI(){
        System.out.println("something different to the super class");
    }

    @Override
    protected void setName(){
        System.out.println("Please enter your name");
        this.name = user_input.next();
    }

    @Override
    protected void setChoice(){
        System.out.println("Pick rock,paper or scissors");
        this.choice = user_input.nextInt();
    }

}
