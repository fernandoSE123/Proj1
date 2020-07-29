package com.mcdf.prj1;

import com.mcdf.prj1.module.Products;

public class Main {

    public static void main(String[] args) {
        printMessage("hello world !");

        Products prod1 = new Products("keyboard12");
        printMessage(prod1.getName());

        printMessage("Testing output");


        // write your code here
    }

    private static void printMessage(String testing_output) {

        System.out.println(testing_output);
    }
}