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
    void testPeek() {
        String item = "test string";
        stack.push(item);
        assertEquals(item, stack.peek());
    }
}
