package ru.geekbrains.datastructure.recursion.MyHW;

public class Thing {
    String name;
    int weight;
    int price;

    public Thing(String name, int weight, int price ) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
