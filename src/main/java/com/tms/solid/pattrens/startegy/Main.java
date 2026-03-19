package com.tms.solid.pattrens.startegy;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,8,1,22,5,9,11};

        Sorter sorter = new Sorter();
        sorter.setStrategy(new BubbleSort());
        sorter.sortArray(numbers);
    }
}
