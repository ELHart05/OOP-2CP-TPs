package assets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RemoveDuplicates {

    public static ArrayList<String> removeDupli(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : list) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }
        return result;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> temp = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.get(i));
        }
        return temp;
    }

    public static void printLinkedList(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> ans = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!ans.containsKey(words[i].toLowerCase())) {
                ans.put(words[i], countOc(words[i].toLowerCase(), words));
            }
        }
        return ans;
    }

    public static int countOc(String word, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals(word))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map = countWords(EnglishWords.words);
        System.out.println(map);
        long startExecussionTime = System.nanoTime();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < EnglishWords.words.length; i++) {
            list.add(EnglishWords.words[i]);
        }

        ArrayList<String> result = removeDupli(list);

        System.out.println(result);
        long endExecussionTime = System.nanoTime();
        long executionTime = endExecussionTime - startExecussionTime;
        System.out.println("Teacher program Execution time: " + executionTime + "// nanoseconds");

    }

}
