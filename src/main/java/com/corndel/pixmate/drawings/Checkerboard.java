package com.corndel.pixmate.drawings;

public class Checkerboard {

    public static void main(String[] args) {


                int rows = 5;  // Number of rows to print

                for (int i = 0; i < rows; i++) {
                    // For even rows, print '* * * * *', for odd rows, print ' * * * *'
                    if (i % 2 == 0) {
                        System.out.println("* * * * *");  // Even rows
                    } else {
                        System.out.println(" * * * *");   // Odd rows
                    }
                }
            }
        }






