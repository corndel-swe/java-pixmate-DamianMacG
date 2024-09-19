package com.corndel.pixmate.drawings;

import javax.print.DocFlavor;

public class Triangle {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < 5; i++) {
            str.append("*");
            System.out.println(str);
        }
    }
}
