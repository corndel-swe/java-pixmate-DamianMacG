package com.corndel.pixmate.drawings;

public class InvertedTriangle {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("*****");  // Initial string of stars

        // For loop to print and remove the last character
        for (int i = str.length(); i > 0; i--) {
            System.out.println(str);
            str.deleteCharAt(str.length() - 1);  // Remove the last character
        }
    }
}
