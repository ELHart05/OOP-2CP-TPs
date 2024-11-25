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
public class TP8part2t4 {
    
    public static Map<Integer, String> sortValuesAlphabetically(Map<Integer, String> map) {
        // Create a list of map entries
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

        // Sort the entries based on the values
        Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));

        // Create a new map with sorted values
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "okba");
        map.put(2, "MrSimoh");
        map.put(3, "MrSerhane");
        map.put(4, "MrSaidi");
        map.put(5, "MrKeskes");

        Map<Integer, String> sortedMap = sortValuesAlphabetically(map);

        // Print the sorted map
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
