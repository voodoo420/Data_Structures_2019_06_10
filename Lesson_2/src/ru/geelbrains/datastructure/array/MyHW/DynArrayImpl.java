package ru.geelbrains.datastructure.array.MyHW;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class DynArrayImpl<E extends Object & Comparable<? super E>> implements DynArray<E> {

    private static final int INITIAL_CAPACITY = 16;

    private E[] data;
    private int size;

    public DynArrayImpl() {
        this(INITIAL_CAPACITY);
    }

    public DynArrayImpl(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public boolean delete(E value) {
        int index = indexOf(value);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public void add(E value) {
        checkGrow();
        data[size++] = value;
    }

    private void checkGrow() {
        if (size == data.length) {
            data = grow();
        }
    }

    private E[] grow() {
        return Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }

    @Override
    public void sortBubble() {
        long start = System.nanoTime();
        int out, in;
        for (out = size - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if ( data[in].compareTo(data[in + 1]) > 0) {
                    swap(in, in + 1);
                }
            }
        }
        long finish = System.nanoTime();
        System.out.println("Bubble-sort completed in " + TimeUnit.NANOSECONDS.toMillis(finish - start)+ " ms");

    }

    @Override
    public void sortSelect() {
        long start = System.nanoTime();
        int out, in, mark;
        for(out=0;out<size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (data[in].compareTo(data[mark]) < 0){
                    mark = in;
                }
            }
            swap(out, mark);
        }
        long finish = System.nanoTime();
        System.out.println("Select-sort completed in " + TimeUnit.NANOSECONDS.toMillis(finish - start)+ " ms");

    }

    @Override
    public void sortInsert() {
        long start = System.nanoTime();
        int in, out;
        for(out = 1;out < size; out++){
            E temp = data[out];
            in = out;
            while(in > 0 && data[in - 1].compareTo(temp) >= 0){
                data[in] = data[in-1];
                --in;
            }
            data[in] = temp;
        }
        long finish = System.nanoTime();
        System.out.println("Insert-sort completed in " + TimeUnit.NANOSECONDS.toMillis(finish - start)+ " ms");
    }

    public void print(int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    private void swap(int index1, int index2) {
        E temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
