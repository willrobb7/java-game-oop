package javaGame;

public abstract class User {

    protected String name;
    protected RockPaperScissorsChoices choice;

    protected abstract void setName();

    protected abstract void setChoice();

    protected String getName (){
        return name;
    }

    protected RockPaperScissorsChoices getChoice (){
        return choice;
    }

}
