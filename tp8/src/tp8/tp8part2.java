/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class tp8part2 {

    public static Set<String> removeDupli(Set<String> list) {
        Set<String> result = new HashSet<>();

        for (String str : list) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String args[]) {

          for (int i = 0; i < EnglishWords.words.length; i++) {
            System.out.println(EnglishWords.words.length);
        }
        long startExecussionTime = System.nanoTime();
        Set<String> list = new HashSet<>();
        for (int i = 0; i < EnglishWords.words.length; i++) {
            list.add(EnglishWords.words[i]);
        }

        Set<String> result = removeDupli(list);

        // System.out.println(result);
        long endExecussionTime = System.nanoTime();
        long executionTime = endExecussionTime - startExecussionTime;
        System.out.println("Teacher program Execution time: " + executionTime + " nanoseconds");
    }

}
