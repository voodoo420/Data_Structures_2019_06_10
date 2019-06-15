package ru.geelbrains.datastructure.array;

public interface Array<E> {

    void add(E value);

    E get(int index);

    boolean remove(E value);

    default boolean contains(E value) {
        return indexOf(value) != -1;
    }

    int indexOf(E value);

    int size();
    boolean isEmpty();

    void display();

    void sortBubble();
    void sortSelect();
    void sortInsert();

    Array copy();



}
