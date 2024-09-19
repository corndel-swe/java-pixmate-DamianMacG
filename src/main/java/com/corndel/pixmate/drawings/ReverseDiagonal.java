package com.corndel.pixmate.drawings;

public class ReverseDiagonal {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();


        for (int i = 0; i < 5; i++) {
            str.append(" ");
        }
        str.append("*");

        for(int i = 0; i < 6; i++) {
            str.deleteCharAt(0);
            System.out.println(str);
        }

    }
}
