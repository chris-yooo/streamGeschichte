package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        int[] sorted = Arrays.stream(zahlen).sorted().toArray();

        Arrays.stream(sorted).forEach(wieDuWillst -> System.out.println(wieDuWillst));

        System.out.println();

        int summit = Arrays.stream(sorted).sum();

        System.out.println(summit);

        System.out.println();

        int productit = Arrays.stream(sorted).reduce(1, (a, b) -> a * b);

        System.out.println(productit);

    }
}