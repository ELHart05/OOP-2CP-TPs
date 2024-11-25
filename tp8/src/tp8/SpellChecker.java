/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isSpelledCorrectly(String word) {
        return dictionary.getDefinition(word) != null;
    }
// foizehoifer
    public static int calculateDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        return dp[m][n];
    }

    public static Set<String> removeDupli(String[] arr) {
        Set<String> list = new HashSet<>();
        for (int i = 0; i < EnglishWords.words.length; i++) {
            list.add(EnglishWords.words[i]);
        }
        return list;
    }
    
    
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null; // Value not found
    }
    public static void affichee (Set<String> setOFwords,String wordMisspelled){
        Map<String,Integer> mapwords = new HashMap<>();
        for (String word : setOFwords){
            int value = calculateDistance(wordMisspelled,word);
            mapwords.put(word,value);
    }
         // Get the values from the HashMap
        Collection<Integer> values = mapwords.values();

        // Create a PriorityQueue and pass the values to its constructor
        var priorityQueue = new PriorityQueue<Integer>(values);
       int a =  priorityQueue.poll(); 
        String key = getKeyByValue(mapwords, a);
        System.out.println(key);
}
    //
}
