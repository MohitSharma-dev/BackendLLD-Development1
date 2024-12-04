package Interfaces;

public class ArrayStack implements Stack{
    int[] stack = new int[10];
    int pointer;
    ArrayStack(int size){
        stack = new int[size];
        pointer = 0;
    }
    @Override
    public void push(Integer o) {
        System.out.println("Pushing " + o + " to the Array stack");
        stack[pointer++] = o;
    }

    @Override
    public void pop() {
        System.out.println("Popping from the Array stack");
        pointer--;
    }

    @Override
    public Integer peek() {
        System.out.println("Peeking from the Array stack");

        return stack[pointer - 1];
    }
}
