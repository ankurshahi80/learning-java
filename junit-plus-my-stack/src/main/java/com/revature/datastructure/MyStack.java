package com.revature.datastructure;

import java.util.NoSuchElementException;

// Implement a stack without using any pre-existing collection
// You can't use the LinkedList class or anything else like that
public class MyStack<E> {

    private int numOfElements;
    private E[] value;

    public MyStack() {
        this.value = (E[]) new Object[2];
    }

    public void push(E element){
        if(this.numOfElements == value.length){
            E[] tempArray = value;
            this.value = (E[]) new Object[numOfElements*2];

            for (int i = 0; i < tempArray.length ; i++) {
                this.value[i] = tempArray[i];
            }
        }
        this.value[numOfElements]=element;
        numOfElements++;
    }

    public E pop(){
        if(this.numOfElements == 0){
//            Unchecked exception
            throw new NoSuchElementException("Stack is empty");
        }

        E returnValues = this.value[numOfElements-1];
        this.value[numOfElements-1] = null;
        numOfElements--;

        return returnValues;
    }

    public int size(){
        return this.numOfElements;
    }

}
