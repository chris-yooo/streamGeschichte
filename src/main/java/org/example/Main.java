package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
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

        try {
        List<Student> eingelesen = Files.lines(Path.of("students.csv"))
                .skip(1)
                .distinct()
                .filter(line -> !line.isEmpty())
                .map(line -> line.split(","))
                .map(line -> new Student(Integer.parseInt(line[0]), line[1], line[2], line[3]))
                .collect(Collectors.toList());

            System.out.println(eingelesen);

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}