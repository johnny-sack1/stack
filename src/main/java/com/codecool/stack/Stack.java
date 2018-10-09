package com.codecool.stack;

public class Stack<T> {
    private int size;
    private T[] stackArray;

    public Stack(int size) {
        this.size = size;
        this.stackArray = (T[]) new Object[size];
    }

    public void push(T t) {
        stackArray[size - 1] = t;
    }

    public T peek() {
        return stackArray[size - 1];
    }
}
