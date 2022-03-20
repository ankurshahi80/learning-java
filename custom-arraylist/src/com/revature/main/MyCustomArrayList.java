package com.revature.main;

public class MyCustomArrayList<E> { // <E> is an example of generic, which allows us to use multiple different types.
    private E[] value;
    private int numOfElement;

    public MyCustomArrayList() {
        this.value = (E[]) new Object[2];
    }

    public MyCustomArrayList(int capacity){
        this.value = (E[]) new Object[capacity];
    }

    public void add(E element){
//        Check if the Value array is full by comparing its length to
//        numOfElement
        if(this.numOfElement == value.length){
//            create a new array to include the existing objects and add a new object
//              1. save the existing array in a temp array
            E[] temp = this.value;
//              2. create a new array twice the size and assign it to the value array
            this.value = (E[]) new Object[this.numOfElement * 2];
//              3. copy the temp array into the new array
            for (int i = 0; i < temp.length ; i++) {
                this.value[i] = temp[i];
            }
        }

//        add the new object
        this.value[numOfElement] = element;
        numOfElement++;
    }

    public E get(int index){
        return this.value[index];
    }

    public int size(){
        return numOfElement;
    }

    public boolean isEmpty(){
        return this.numOfElement == 0;
    }
}
