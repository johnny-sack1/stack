package com.codecool.stack;

public class Stack<T> {
    private int size;
    private int top = -1;
    private T[] stackArray;

    public Stack(int size) {
        this.size = size;
        this.stackArray = (T[]) new Object[size];
    }

    public void push(T t) {
        stackArray[++top] = t;
    }

    public T peek() {
        return stackArray[top];
    }

    public T pop() {
        return stackArray[top--];
    }

    public int getSize() {
        return this.size;
    }

    public int getNumOfFreeSpaces() {
        return size - top - 1;
    }
}
