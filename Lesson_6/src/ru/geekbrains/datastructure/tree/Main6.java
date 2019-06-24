package ru.geekbrains.datastructure.tree;

public class Main6 {

    public static void main(String[] args) {
//        testTree();
        Tree<Integer> tree = new TreeImpl<>();
        tree.add(60);
        tree.add(25);
        tree.add(66);
        tree.add(15);
        tree.add(5);
        tree.add(20);
        tree.add(45);
        tree.add(30);
        tree.add(55);
        tree.add(32);

        tree.display();

        tree.remove(25);

        tree.display();


    }

    private static void testTree() {
        Tree<Integer> tree = new TreeImpl<>();
        tree.add(60);
        tree.add(50);
        tree.add(66);
        tree.add(70);
        tree.add(67);
        tree.add(81);
        tree.add(40);
        tree.add(31);
        tree.add(45);
        tree.add(55);
        tree.add(57);

        System.out.println("Root is 60: " + tree.find(60));
        System.out.println("Find 70: " + tree.find(70));
        System.out.println("Find 31: " + tree.find(31));
        System.out.println("Find 555: " + tree.find(555));

        tree.traverse(Tree.TraverseMode.IN_ORDER);
    }
}
