package ru.geekbrains.datastructure.hashtable.MyHW;

import ru.geekbrains.datastructure.hashtable.HashTable;
import ru.geekbrains.datastructure.hashtable.Item;

import java.util.LinkedList;

public class ChainHashTableImpl implements HashTable {

    private static class Entry {
        private Item key;
        private int value;

        private Entry(Item key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        private int getCost() {
            return value;
        }
    }

    private LinkedList<Entry>[] data;
    private int size;


    ChainHashTableImpl(int size) {
        this.size = size;
        this.data = new LinkedList[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();
        }
    }

    private int hashFunc(Item key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(Item item, Integer cost) {
        int index = hashFunc(item);
        return data[index].add(new Entry(item, cost));
    }

    @Override
    public Integer get(Item item) {
        int index = hashFunc(item);
        return data[index].getLast().getCost();
    }

    @Override
    public boolean remove(Item item) {
        int index = hashFunc(item);
        return data[index].removeIf(entry -> entry.key.equals(item));
    }

    public boolean remove(Item item, int cost) {
        int index = hashFunc(item);
        return data[index].removeIf(entry -> entry.getCost() == cost);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println("-----------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s] %n", i, data[i]);
        }
        System.out.println("-----------");
    }
}
