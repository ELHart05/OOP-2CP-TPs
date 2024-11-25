/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class TP8part2t3 {
       public static Map<String, Integer> countWords(String words[]) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Remove punctuation and convert to lowercase
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Increment the count for the word in the map
            int count = wordCountMap.getOrDefault(cleanedWord, 0);
            wordCountMap.put(cleanedWord, count + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        
        Map<String, Integer> wordCountMap = countWords(EnglishWords.words);

        // Print the word count map
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
