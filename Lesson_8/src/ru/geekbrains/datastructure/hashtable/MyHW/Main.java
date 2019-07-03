package ru.geekbrains.datastructure.hashtable.MyHW;

import ru.geekbrains.datastructure.hashtable.Item;

public class Main {

    public static void main(String[] args) {

        ChainHashTableImpl chainHashTable = new ChainHashTableImpl(10);

        chainHashTable.put(new Item(1, "Orange"), 150);
        chainHashTable.put(new Item(77, "Banana"), 100);
        chainHashTable.put(new Item(77, "Banana"), 228);
        chainHashTable.put(new Item(60, "Lemon"), 250);
        chainHashTable.put(new Item(52, "Milk"), 120);
        chainHashTable.put(new Item(21, "Potato"), 67);

        chainHashTable.display();

        System.out.println("Size is " + chainHashTable.size());

        chainHashTable.remove(new Item(1, "Orange"));
        chainHashTable.remove(new Item(77, "Banana"),228);

        chainHashTable.display();

        System.out.println("Cost potato is " + chainHashTable.get(new Item(21, "Potato")));
        System.out.println("Cost banana is " + chainHashTable.get(new Item(77, "Banana")));

    }
}
