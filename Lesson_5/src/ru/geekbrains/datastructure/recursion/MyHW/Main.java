package ru.geekbrains.datastructure.recursion.MyHW;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Thing> things = new ArrayList<>();
        things.add(new Thing("book", 1, 600));
        things.add(new Thing("binoculars", 2, 5000));
        things.add(new Thing("medkit", 4, 1500));
        things.add(new Thing("notebook", 2, 40000));
        things.add(new Thing("bowler", 1, 500));

        Backpack backpack = new Backpack(5);

        System.out.println(backpack.combine(things));

    }
}
