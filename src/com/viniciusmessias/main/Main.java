package com.viniciusmessias.main;

import com.viniciusmessias.domain.BubbleSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> addingNumbers = new ArrayList<>();
        char command = ' ';

        System.out.println("####### Bubble Sort app v1.0 #######");

        System.out.print("Enter integer please: ");
        System.out.println("(Or non integer to quit): ");
        System.out.print("> ");
        while (userInput.hasNextInt()) {
            addingNumbers.add(userInput.nextInt());
            userInput.nextLine();
            System.out.print("> ");
        }
        userInput.nextLine();
        bubbleSort.addElementInArray(addingNumbers);

        while (command != '0') {
            System.out.println("\n1 - Show in ascending order");
            System.out.println("2 - Show in descending order");
            System.out.println("0 - Quit");
            System.out.print("> ");

            String result = userInput.nextLine();
            System.out.println();
            if (result.length() != 1) {
                System.out.println("Invalid command, please try again:");
                continue;
            }
            command = result.charAt(0);

            switch (command) {
                case '1':
                    List<Integer> ascending = bubbleSort.ascendingSort();
                    System.out.print("Ascending order: ");
                    for (int ascend : ascending) {
                        System.out.print("[" + ascend + "]");
                    }
                    System.out.println();
                    break;
                case '2':
                    List<Integer> descending = bubbleSort.descendingSort();
                    System.out.print("Descending order: ");
                    for (int descend : descending) {
                        System.out.print("[" + descend + "]");
                    }
                    System.out.println();
                    break;
                case '0':
                    System.out.println("Leaving the app...");
                    break;
                default:
                    System.out.println("Invalid command, please try again:");
            }
        }
        System.out.println("####### Bubble Sort app v1.0 #######");
    }
}
