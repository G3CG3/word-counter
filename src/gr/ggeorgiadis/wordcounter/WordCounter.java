package gr.ggeorgiadis.wordcounter;

import java.util.Arrays;
import java.util.HashMap;

public class WordCounter {
    public static HashMap<String, Integer> countWords(String text) {
        HashMap<String, Integer> counter = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = text.split("\\s+");

        Arrays.stream(words)
                .filter(word -> !word.isEmpty())
                .forEach(word -> counter.put(word, counter.getOrDefault(word, 0) + 1));

        return counter;
    }
}
