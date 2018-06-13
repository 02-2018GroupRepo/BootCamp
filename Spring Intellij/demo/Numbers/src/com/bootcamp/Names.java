package com.bootcamp;
import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.util.*;
import java.io.File;
public class Names {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\syntel\\Desktop\\Spring Intellij\\demo\\Numbers\\names.txt");
        Scanner namesScanner = new Scanner(file);
        namesScanner.useDelimiter(",");
        List<String> names = new ArrayList<String>();
        char startingChar = 'A';
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        int sum = 0;

        while (namesScanner.hasNext()) {
            names.add(namesScanner.next());
        }

        Collections.sort(names);

        for(int i = 1; i <= 26; i++){
            charMap.put(startingChar, i);
            startingChar++;
        }
        System.out.println(charMap);

       Map<List<String>,Integer> entry = new HashMap<List<String>, Integer>();


//
//       while (it.hasNext()) {
//    Map.Entry pairs = (Map.Entry)it.next();
//    If(pairs.getValue().contains(your value)
//    {
//        // do stuff
//    }
//}


//       for(int i= 0; i < names.size(); i++){
//
//            for(int j = 0; j < names.get(i).length(); j++){
//                char letter = charMap.get()
//            }
//       }




        Collections.sort(names);
        System.out.println(names);
        System.out.println(sum);

    }
}
