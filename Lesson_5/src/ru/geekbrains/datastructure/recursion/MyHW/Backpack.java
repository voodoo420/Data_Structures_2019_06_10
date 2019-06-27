package ru.geekbrains.datastructure.recursion.MyHW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Backpack {

    private final int weight;
    private List<Thing> variation;
    private Set<List<Thing>> result = new HashSet<>();

    public Backpack(int weight) {
        this.weight = weight;
    }

    public int totalWeight(List<Thing> things){
        int total = 0;
        for (Thing thing:things) {
            total += thing.weight;
        }
        return total;
    }

    public int totalPrice(List<Thing> things){
        int total = 0;
        for (Thing thing:things) {
            total += thing.price;
        }
        return total;
    }

    public String combine(List<Thing> list){
        variation = list;
        mix(variation.size());

        List<Thing> bestPrice = new ArrayList<>();
        for (List<Thing> things : result) {
            if (totalPrice(things) > totalPrice(bestPrice)){
                bestPrice  = things;
            }
        }

        return String.format("Best combination of things is %s with total price %d", bestPrice, totalPrice(bestPrice));
    }

    private void mix(int length) {
        if (length == 1) {
            return;
        }
        for (int i = 0; i < length; i++) {
            mix(length - 1);
            List<Thing> things = new ArrayList<>(variation);
            while (totalWeight(things) > weight){
                things.remove(things.size()-1);
            }
            result.add(things);
            rotate(length);
        }
    }

    private void rotate(int length) {
        int pos = variation.size() - length;
        Thing temp = variation.get(pos);
        for (int i = pos + 1; i < variation.size(); i++) {
            variation.set((i - 1),variation.get(i));
        }
        variation.set(variation.size() - 1, temp);
    }

    public void showResult() {
        for (List<Thing> things: result) {
            System.out.println(things);
        }

    }
}
