package gr.ggeorgiadis.wordcounter;

import java.util.HashMap;
import java.util.Scanner;

public class WordCounterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scanner.nextLine();

        HashMap<String, Integer> frequencies = WordCounter.countWords(input);

        System.out.println("\nWord Frequencies:");
        frequencies.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
