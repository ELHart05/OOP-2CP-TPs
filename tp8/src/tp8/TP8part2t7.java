/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;
import java.util.*;

/**
 *
 * @author ASUS_VivoBook
 */
public class TP8part2t7 {
    public static Map<Character,List<String>>  setToMAP (Set<String> setst){
        Map<Character,List<String>> MapFinal = new TreeMap<>() ;
        for (String set: setst){
            if (!set.isEmpty()){
                char keyChar = set.charAt(0);
                List<String> listValue = MapFinal.getOrDefault(keyChar, new ArrayList<>());
                listValue.add(set);
                MapFinal.put(keyChar, listValue);
            }
        }
        
        return MapFinal;
    }
    public static void main(String [] args){
        Set<String> SetString = new HashSet<>();
        SetString.add("okba");
        SetString.add("salim");
        SetString.add("fouad");
        SetString.add("salmi");
        SetString.add("ryad");
        System.out.println(setToMAP(SetString) );
        
    }
}
