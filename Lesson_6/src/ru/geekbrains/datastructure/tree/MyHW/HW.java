package ru.geekbrains.datastructure.tree.MyHW;

import java.util.Random;

public class HW {
    public static void main(String[] args) {

        int maxLevel = 4;
        int minRange = -25;
        int maxRange = 25;
        int totalTrees = 20;
        int balancedTrees = 0;

        Random random = new Random();

        for (int j=0; j < totalTrees; j++) {
            TreeImpl<Integer> tree = new TreeImpl(maxLevel);
            for (int i = 0; i < tree.maxNodes(); i++) {
                tree.add(random.nextInt(( maxRange - minRange) + 1) + minRange);
            }
//            tree.display();
//            System.out.println(tree.isBalanced());
            if(tree.isBalanced())balancedTrees++;
        }

        System.out.println("Unbalanced trees: " + (int)((double)(totalTrees-balancedTrees)/totalTrees * 100) + "%");
    }


}
