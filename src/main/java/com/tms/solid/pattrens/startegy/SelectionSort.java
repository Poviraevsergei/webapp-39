package com.tms.solid.pattrens.startegy;

import java.util.Arrays;

public class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Сортировка выбором");
        for (int i = 0; i < array.length - 1; i++) {
            // Находим минимальный элемент в неотсортированной части
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Запоминаем индекс минимума [3, 12]
                }
            }
            // Меняем местами найденный минимум с первым элементом [1, 12]
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
