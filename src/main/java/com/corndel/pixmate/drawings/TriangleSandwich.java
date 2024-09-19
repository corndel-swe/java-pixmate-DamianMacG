package com.corndel.pixmate.drawings;

public class TriangleSandwich {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < 5; i++) {
            str.append("*");
            System.out.println(str);
        }
        for (int i = str.length() -1; i > 0; i--) {
            str.deleteCharAt(str.length() - 1);
            System.out.println(str);// Remove the last character
        }

    }
}
