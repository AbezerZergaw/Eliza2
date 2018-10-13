package com.ea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Eliza eliza = new Eliza();

        do {
            String word = input.nextLine();
            if (word.equalsIgnoreCase("q") || word.equalsIgnoreCase("I am feeling great.")) {
                break;
            } else
                ;
                System.out.println(eliza.randResponse(word) +"\nEnter you response here?");

        } while (true);
    }
}
