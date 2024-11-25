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
public class TP8part2t6 {
        public static ArrayList<Integer> rearrange(ArrayList<Integer> numbers) {
        List<Integer> evenNumbers = new LinkedList<>();
        List<Integer> oddNumbers = new LinkedList<>();

        // Separate even and odd numbers into two lists
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        // Combine the even and odd numbers into a single ArrayList
        ArrayList<Integer> rearrangedNumbers = new ArrayList<>();

        rearrangedNumbers.addAll(evenNumbers);
        rearrangedNumbers.addAll(oddNumbers);

        return rearrangedNumbers;
    }
        
         public static void main(String[] args) {
             ArrayList<Integer> arrList = new ArrayList<>();
             arrList.add(12);
             arrList.add(19);
             arrList.add(23);
             arrList.add(90);
             arrList.add(15);
             System.out.println(rearrange(arrList));
         }

}