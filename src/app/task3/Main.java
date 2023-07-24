package app.task3;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = getData();
        printInitialList(list);
        printEditedList(list);
    }

    private static LinkedList<String> getData() {
        return new LinkedList<>(List.of("orange", "grape", "apple", "lemon"));
    }

    private static void printInitialList(LinkedList<String> list) {
        System.out.println("Initial list:");
        getOutput(list);
    }

    private static void addData(LinkedList<String> list) {
        list.addFirst("plum");
        list.addLast("mango");
    }

    private static void printEditedList(LinkedList<String> list) {
        System.out.println("Edited list:");
        addData(list);
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
