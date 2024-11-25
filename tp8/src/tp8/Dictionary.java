/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class Dictionary {
     

    private Map<String, String> wordDefinitions;

    public Dictionary() {
        wordDefinitions = new HashMap<>();
    }

    public void addWordDefinition(String word, String definition) {
        wordDefinitions.put(word.toLowerCase(), definition);
    }

    public String getDefinition(String word) {
        return wordDefinitions.get(word.toLowerCase());
    }
}

