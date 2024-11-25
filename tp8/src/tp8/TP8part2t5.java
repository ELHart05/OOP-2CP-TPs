/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class TP8part2t5 {

    public static List<String> wordfrequently(String str, int n) {

        String[] words = str.split("\\s+");
        Map<String, Integer> wordsrecc = new HashMap<>();

        // create a map for each word has an occurence
        for (String str1 : words) {
            String cleanWord = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
            int count = wordsrecc.getOrDefault(cleanWord, 0);
            wordsrecc.put(cleanWord, count + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pQTOnfreq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pQTOnfreq.addAll(wordsrecc.entrySet());
           List<String> mostFrequentWords = new ArrayList<>();
        for (int i = 0; i < n && !pQTOnfreq.isEmpty(); i++) {
            mostFrequentWords.add(pQTOnfreq.poll().getKey());
        }

        return mostFrequentWords;
       
    }

    public static void main(String[] args) {
        String str = "GDG Algiers for once, GDG Algiers for ever.";
        System.out.println(wordfrequently(str, 4));
    }
}
