package StreamsAndLambdas;

import java.io.FileNotFoundException;

public class Student {
    static Integer findByRollNumber(int x){
        return  1/0;
    }

    static void find(int x) throws FileNotFoundException {
        if(x % 2 == 0){
            throw new ArithmeticException();
        } else if (x % 3 == 0){
            throw new NullPointerException();
        } else if (x % 5 == 0){
            throw new FileNotFoundException();
        }
    }

    static void findAgain(int x){
        findAgain(x * 2);
    }

    static void myException(){
        throw new MyOwnException("This is my own exception");
    }
}
// if you are throwing a normal Exception ,
