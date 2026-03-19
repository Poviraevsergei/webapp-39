package com.tms.solid.pattrens.startegy;

public class Sorter {
    SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array){
        if (strategy == null){
            strategy = new BubbleSort();
        }
        strategy.sort(array);
    }
}
