package com.revature.model;

public interface MyList<E> {

    void add(E element); // public implicitly

    int size(); // public implicitly

    E get(int index); // public implicitly

    boolean isEmpty(); // public implicitly
}
