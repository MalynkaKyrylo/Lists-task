package app.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = getData();
        printInitialList(list);
        printPartedList(list);
    }

    private static void printInitialList(List<String> list) {
        System.out.println("Initial list:");
        getOutput(list);
    }

    private static void printPartedList(List<String> list) {
        System.out.println("List part:");
        getOutput(partedList(list));
    }

    private static List<String> partedList(List<String> list) {
        return list.subList(1, 3);
    }

    private static ArrayList<String> getData() {
        return new ArrayList<>(List.of("orange", "mango", "banana", "apple", "kiwi", "cherry"));
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
