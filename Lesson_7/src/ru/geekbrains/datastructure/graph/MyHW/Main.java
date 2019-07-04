package ru.geekbrains.datastructure.graph.MyHW;

public class Main {
    public static void main(String[] args) {

        Graph cities = new Graph(10);
        cities.addVertex("Москва");
        cities.addVertex("Тула");
        cities.addVertex("Липецк");
        cities.addVertex("Воронеж");
        cities.addVertex("Рязань");
        cities.addVertex("Томбов");
        cities.addVertex("Саратов");
        cities.addVertex("Калуга");
        cities.addVertex("Орел");
        cities.addVertex("Курск");

        cities.addEdges("Москва", "Тула", "Рязань", "Калуга");
        cities.addEdge("Тула", "Липецк");
        cities.addEdges("Воронеж", "Липецк","Саратов", "Курск");
        cities.addEdge("Рязань", "Томбов");
        cities.addEdge("Томбов","Саратов");
        cities.addEdge("Калуга","Орел");
        cities.addEdge("Орел","Курск");

        System.out.println(cities.bestPath("Тула", "Курск"));

    }

}
