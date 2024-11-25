/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Lenovo
 */
public class TP8 {

    public static int sumArrayList(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    
        public static LinkedList<String> removeShortStrings(LinkedList<String> strings) {
        LinkedList<String> filteredStrings = new LinkedList<>();
        for (String str : strings) {
            if (str.length() >= 5) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
        
            public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonElements = new HashSet<>();
        for (Integer element : set1) {
            if (set2.contains(element)) {
                commonElements.add(element);
            }
        }
        return commonElements;
    }
                public static Map<Integer, Integer> countIntegers(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        System.out.println(sumArrayList(numbers))  ;
        
        
       //LinkedKist
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Hello");
        strings.add("there");
        strings.add("worldd");
        strings.add("esisba");
        strings.add("Java");

        LinkedList<String> filteredStrings = removeShortStrings(strings);
        System.out.println("Filterage: " + filteredStrings);
        
        //sets
        
          Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(18);
        set1.add(13);

        Set<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(18);
        set2.add(13);
        

        Set<Integer> commonElements = findCommonElements(set1, set2);
        System.out.println("Common elements: " + commonElements);
    }

}
