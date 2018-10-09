package com.codecool.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack<String> stack;

    @BeforeEach
    void setup() {
        stack = new Stack<>(10);
    }

    @Test
    void testPushAndPeek() {
        String item = "test string";
        stack.push(item);
        assertEquals(item, stack.peek());
    }

    @Test
    void testPop() {
        String item1 = "first string";
        String item2 = "second string";
        stack.push(item1);
        stack.push(item2);
        stack.pop();
        assertEquals(item1, stack.peek());
    }

    @Test
    void testSize() {
        int size = stack.getSize();
        assertEquals(size, 10);
    }

    @Test
    void testFreeSpaces() {
        stack.push("string1");
        stack.push("string2");
        int numOfFreeSpaces = stack.getNumOfFreeSpaces();
        assertEquals(numOfFreeSpaces, 8);
    }
}
