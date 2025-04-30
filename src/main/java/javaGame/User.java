package javaGame;

// When a class is abstract you can't instantiate it
// By using abstract this is no longer a "concrete type"
public abstract class User {

    protected String name;
    protected int choice;

    // Everything that inherits from User gets this method for free
    // The implementation is the same for all sub classes (unless you override the method)
    public void whoAmI(){
        System.out.println(name);
    }

    // This is an abstract method. Abstract methods don't have a body
    protected abstract void setName();

    protected abstract void setChoice();

    protected String getName (){
        return name;
    }

    protected int getChoice (){
        return choice;
    }

}
