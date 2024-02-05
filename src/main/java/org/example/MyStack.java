package org.example;

import java.util.EmptyStackException;

public class MyStack {
private Object[] elements;
private int size;

    public MyStack(int maxSize) {
        this.elements = new Object[maxSize];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void push(Object element) {
        if (size == elements.length) throw new StackOverflowError();
        this.elements[size] = element;
        size++;
    }

    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return elements[size-1];
    }

    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        Object top = peek();
        size--;
        return top;
    }
}
