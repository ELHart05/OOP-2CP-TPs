/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

/**
 *
 * @author Lenovo
 */
import java.util.LinkedList;

public class reverseLinkedList {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        // Iterate over the original list from the last element to the first
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(12);
        originalList.add(23);
        originalList.add(13);
        originalList.add(14);

        LinkedList<Integer> reversedList = reverseLinkedList(originalList);

        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }
}