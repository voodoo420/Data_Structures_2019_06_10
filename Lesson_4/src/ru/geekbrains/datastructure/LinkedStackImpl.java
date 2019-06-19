package ru.geekbrains.datastructure;

import ru.geelbrains.datastructure.ads.stack.Stack;

public class LinkedStackImpl<E> implements Stack<E> {

    private LinkedList<E> data = new SimpleLinkedListImpl<>();

    @Override
    public void push(E value) {
        data.insertFirst(value);
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirstElement();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
