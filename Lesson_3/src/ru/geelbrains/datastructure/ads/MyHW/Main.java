package ru.geelbrains.datastructure.ads.MyHW;

import ru.geelbrains.datastructure.ads.stack.StackImpl;

public class Main {

    public static void main(String[] args) {

        String str = "gnirtS";

        StackImpl<Character> chars = new StackImpl<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            chars.push(str.charAt(i));
        }

        while (!chars.isEmpty() ){
            System.out.print(chars.pop());
        }

    }


}
