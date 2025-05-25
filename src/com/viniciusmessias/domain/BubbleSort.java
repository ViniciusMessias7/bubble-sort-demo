package com.viniciusmessias.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    private final List<Integer> ascending = new ArrayList<>();
    private final List<Integer> descending = new ArrayList<>();

    public void addElementInArray(List<Integer> number) {
        ascending.clear();
        descending.clear();
        for (int element : number) {
            ascending.add(element);
            descending.add(element);
        }
    }

    public List<Integer> ascendingSort() {
        for (int i = 0; i < ascending.size() - 1; i++) {
            for (int j = 0; j < ascending.size() - 1 - i; j++) {
                if (ascending.get(j) > ascending.get(j + 1)) {
                    Collections.swap(ascending, j, j + 1);
                }
            }
        }
        return ascending;
    }

    public List<Integer> descendingSort() {
        for (int i = 0; i < descending.size() - 1; i++) {
            for (int j = 0; j < descending.size() - 1 - i; j++) {
                if (descending.get(j) < descending.get(j + 1)) {
                    Collections.swap(descending, j, j + 1);
                }
            }
        }
        return descending;
    }
}
