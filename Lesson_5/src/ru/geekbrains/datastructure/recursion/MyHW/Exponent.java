package ru.geekbrains.datastructure.recursion.MyHW;

public class Exponent {

    public static double exponent(int num, int exp){

        if (exp < 0){
            return 1 / (num * exponent(num,(Math.abs(-exp)) - 1));
        }

        if (exp == 0){
            return 1;
        }
        return num * exponent(num,exp - 1);
    }


    public static void main(String[] args) {

        System.out.println(exponent(2,-8));
        System.out.println(exponent(2,8));
        System.out.println(exponent(2,0));
        System.out.println(exponent(0,2));
        System.out.println(exponent(-2,1));
    }


}
