import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class PartOne<E> {
    static int sumOfEvens(ArrayList<Integer> list) {
        int counter = 0;
        for (int number : list) {
            if (number % 2 == 0) {
                counter += number;
            }
        }
        return counter;
    }

    static LinkedList<String> removeLessFive(LinkedList<String> words) {

        LinkedList<String> temp = new LinkedList<>();
        for (String word : words) {
            if (word.length() >= 5) {
                temp.add(word);
            }
        }
        return temp;

    }

    public static Set<Integer> intersectionSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        return commonElements;
    }

    static Map<Integer, Integer> arrayToMap(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        return countMap;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(15);
        arr2.add(3);
        arr2.add(3);
        arr2.add(2);
        arr2.add(9);
        arr2.add(1);
        arr2.add(4);
        System.out.println(sumOfEvens(arr2));
        LinkedList<String> arr3 = new LinkedList<>();
        arr3.add("Hello");
        arr3.add("World");
        arr3.add("Java");
        arr3.add("POO");
        arr3.add("Serhane");
        System.out.println(removeLessFive(arr3));
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        System.out.println(intersectionSets(set1, set2));
        int[] arr = { 15, 16, 16, 34, 8, 2, 1 };
        System.out.println(arrayToMap(arr));
    }
}
