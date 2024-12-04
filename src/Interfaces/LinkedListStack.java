package Interfaces;

public class LinkedListStack implements Stack{
    @Override
    public void push(Integer o) {
        System.out.println("Pushing " + o + " to the Linked List stack");
    }

    @Override
    public void pop() {
        System.out.println("Popping from the Linked List stack");
    }

    @Override
    public Integer peek() {
        System.out.println("Peeking from the Linked List stack");
        return 0;
    }
}
