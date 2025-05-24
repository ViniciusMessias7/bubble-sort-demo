package com.viniciusmessias.main;

import com.viniciusmessias.domain.BubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        int[] valueElements = new int[5];
        char command = ' ';

        System.out.println("####### Bubble Sort app v1.0 #######");
        for (int i = 0; i < valueElements.length; i++) {
            System.out.print("Enter a whole number (" + (i + 1) + "/" + valueElements.length + "):");
            valueElements[i] = userInput.nextInt();
            userInput.nextLine();
        }
        bubbleSort.addElementInArray(valueElements);

        while (command != '0') {
            System.out.println("1 - Show in ascending order");
            System.out.println("2 - Show in descending order");
            System.out.println("0 - Quit");
            command = userInput.nextLine().charAt(0);

            switch (command) {
                case '1':
                    int[] ascending = bubbleSort.ascendingSort();
                    System.out.print("Ascending order: ");
                    for (int ascend : ascending) {
                        System.out.print("[" + ascend + "]");
                    }
                    System.out.println();
                    break;
                case '2':
                    int[] descending = bubbleSort.descendingSort();
                    System.out.print("Descending order: ");
                    for (int descend : descending) {
                        System.out.print("[" + descend + "]");
                    }
                    System.out.println();
                    break;
            }
        }
        System.out.println("####### Bubble Sort app v1.0 #######");
    }
}
