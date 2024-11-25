/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class Part3 {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addWordDefinition("java", " is programming language used to developed desktop app");
        dictionary.addWordDefinition("cat", "A small domesticated carnivorous mammal.");
        dictionary.addWordDefinition("jj", "A small domesticated carnivorous mammal.");

        SpellChecker spellChecker = new SpellChecker(dictionary);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check its spelling (or 'quit' to exit): ");
        String word = scanner.nextLine();

        while (!word.equalsIgnoreCase("quit")) {
            if (spellChecker.isSpelledCorrectly(word)) {
                System.out.println("The word is spelled correctly");
            } else {
                System.out.println("The word is not spelled correctly");
            }

            System.out.print("Enter another word (or 'quit' to exit): ");
            word = scanner.nextLine();
        }

        scanner.close();
    }
}
