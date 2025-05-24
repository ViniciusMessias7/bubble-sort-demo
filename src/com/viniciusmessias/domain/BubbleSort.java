package com.viniciusmessias.domain;

public class BubbleSort {
    private final int[] numbers = new int[5];
    private final int[] ascending = new int[numbers.length];
    private final int[] descending = new int[numbers.length];

    public void addElementInArray(int[] number) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number[i];
        }
    }

    public int[] ascendingSort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                }
                ascending[j] = numbers[j];
                ascending[j + 1] = numbers[j + 1];
            }
        }
        return ascending;
    }

    public int[] descendingSort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                }
                descending[j] = numbers[j];
                descending[j + 1] = numbers[j + 1];
            }
        }
        return descending;
    }
}
