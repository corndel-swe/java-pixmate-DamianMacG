package com.corndel.pixmate.drawings;

public class Rectangle {

    public static void main(String[] args) {
        int width = 10;
        int height = 5;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                str.append("*");
            }

            str.append(System.lineSeparator());
        }

        System.out.println(str.toString());
    }
}


//        // Print the top border
//        System.out.println(printUnderscores(width));
//
//        // Print the sides
//        for (int i = 0; i < height - 2; i++) {
//            printSides(width);
//        }
//
//        // Print the bottom border if height is greater than 1
//        if (height > 1) {
//            System.out.println(printUnderscores(width));
//        }
//    }
//
//    // Method to print a line of underscores with a specified width
//    public static String printUnderscores(int width) {
//        return "_".repeat(width);
//    }
//
//    // Method to print the sides of the rectangle with a specified width
//    public static void printSides(int width) {
//        System.out.println("|" + " ".repeat(width - 2) + "|");
//    }



