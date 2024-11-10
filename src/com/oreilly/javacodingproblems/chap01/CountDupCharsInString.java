package com.oreilly.javacodingproblems.chap01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class CountDupCharsInString {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        //System.out.println(countDupChars(str));
        System.out.println(countDuplicateCharacters(str));
    }

    public static int countDupChars(String str){

        Map<Character , Integer> charMap = new HashMap<>();
        int dupCount = 0;

        for (Character ch: str.toCharArray() ) {
            if(charMap.containsKey(ch)){
                charMap.put(ch , charMap.get(ch) + 1);
                dupCount++;
            } else {
                charMap.put(ch , 1);
            }

        }
        System.out.println(charMap);
        return dupCount;
    }

    public static Map<Character, Integer> countDuplicateCharacters(String str) {

        Map<Character, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }
}

// T - 1 , h -3 , i -4, s -5