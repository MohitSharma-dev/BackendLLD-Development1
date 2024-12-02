package Inheritance;

public class D extends C{

    D(){
        super(5,10);
        System.out.println("Constructor of D is called");
    }
}

// super() : it can only be called in the first line