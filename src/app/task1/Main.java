package app.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = getData();
        printInitialList(list);
        printSortedList(list);
    }

    private static ArrayList<String> getData() {
        return new ArrayList<>(List.of("John", "Alice", "Robert", "Lisa", "David", "Amanda"));
    }

    private static void printInitialList(List<String> list) {
        System.out.println("Initial list:");
        getOutput(list);
    }

    private static void printSortedList(List<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list:");
        getOutput(list);
    }

    private static void getOutput(List<String> list) {
        int counter = 1;
        for (String name : list) {
            System.out.println(counter + ") " + name);
            counter++;
        }
        System.out.println();
    }
}
