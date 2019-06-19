package ru.geelbrains.datastructure.array.MyHW;

public interface DynArray<E> {


    boolean delete (E value);

    void add(E value);

    int indexOf(E value);

    E get (int index);

    void print();

    void sortBubble();
    void sortSelect();
    void sortInsert();

}
