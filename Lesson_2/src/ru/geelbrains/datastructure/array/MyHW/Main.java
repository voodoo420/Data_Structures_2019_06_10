package ru.geelbrains.datastructure.array.MyHW;

public class Main {

    private final static int CAPACITY = 1_000_000;

    public static void main(String[] args) {

        DynArrayImpl<Integer> array1 = new DynArrayImpl<>(CAPACITY);
        DynArrayImpl<Integer> array2 = new DynArrayImpl<>(CAPACITY);
        DynArrayImpl<Integer> array3 = new DynArrayImpl<>(CAPACITY);

        for (int i = 0; i < CAPACITY; i++) {
            int rndNum = (int) (Math.random()*100);
            array1.add(rndNum);
            array2.add(rndNum);
            array3.add(rndNum);
        }

        array1.print(0,100);
        array2.print(0,100);
        array3.print(0,100);

        array1.sortBubble();
        array2.sortSelect();
        array3.sortInsert();

        array1.print(0,100);
        array2.print(0,100);
        array3.print(0,100);


    }

}
