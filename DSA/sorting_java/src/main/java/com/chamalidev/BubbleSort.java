package com.chamalidev;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = createRandomNumbers();
        System.out.println("Before: ");
        printArray(numbers);

        int[] sorted = bubbleSort(numbers);
        System.out.println("After: ");
        printArray(sorted);

    }

    private static int[] bubbleSort(int[] numbers) {
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;

                    swappedSomething = true;
                }
            }
        }

        return numbers;
    }

    private static int[] createRandomNumbers() {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        return numbers;
    }

    private static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
