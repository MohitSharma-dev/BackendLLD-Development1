package Inheritance;

public class C extends B{

    C(){
        System.out.println("Constructor of C is called");
    }

    C(int x){
        this();
        System.out.println("Parametrized of C is called");
    }

    C(int x, int y){
        this(x);
        System.out.println("Second paramtertizewd of C");
    }
}

