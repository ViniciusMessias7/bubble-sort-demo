package com.viniciusmessias.domain;

public class BubbleSort {
    private final int[] numbers = new int[5];
    private final int[] ascending = new int[numbers.length];
    private final int[] descending = new int[numbers.length];

    public void addElementInArray(int[] number) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number[i];
            ascending[i] = numbers[i];
            descending[i] = numbers[i];
        }
    }

    public int[] ascendingSort() {
        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = 0; j < ascending.length - 1 - i; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    int temporary = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = temporary;
                }
            }
        }
        return ascending;
    }

    public int[] descendingSort() {
        for (int i = 0; i < descending.length - 1; i++) {
            for (int j = 0; j < descending.length - 1 - i; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temporary = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temporary;
                }
            }
        }
        return descending;
    }
}
