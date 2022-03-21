package com.revature.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class MyStackTest {

//    Arrange, Act and Assert

//    Positive test
    @Test
    public void testPushToMyStack_andSize(){
        // Arrange
        MyStack<String> stack = new MyStack<>();
        String element = "String 1";

        // Act
        stack.push(element);

        // Assert
        Assertions.assertEquals(1,stack.size());
    }

//    Positive test
    @Test
    public void testPushToStack_andPopElements() {
        // Arrange
        MyStack<String> stack = new MyStack<>();
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");

        // Act
        String element3 = stack.pop();
        String element2 = stack.pop();
        String element1 = stack.pop();

        // Assert
        Assertions.assertEquals(0,stack.size());
        Assertions.assertEquals("String 3", element3);
        Assertions.assertEquals("String 2", element2);
        Assertions.assertEquals("String 1", element1);

    }

//    Negative test
    @Test
    public void testPopFromEmptyStack() {
        MyStack<String> stack = new MyStack<>();

        Assertions.assertThrows(NoSuchElementException.class, ()->{
            stack.pop();
        });
    }
}
