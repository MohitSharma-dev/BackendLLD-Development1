package Interfaces;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
//        you can't directly create object of an interface
//        Stack stack = new Stack();

        Stack stack = new ArrayStack(15);
        Stack stack2 = new LinkedListStack();
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.peek();
    }
}
