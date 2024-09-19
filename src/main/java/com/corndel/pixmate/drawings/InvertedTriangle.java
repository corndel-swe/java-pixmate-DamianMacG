package com.corndel.pixmate.drawings;

public class InvertedTriangle {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("*****");


        for (int i = str.length(); i > 0; i--) {
            System.out.println(str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
