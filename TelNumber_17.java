package com.telNumber_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TelNumber_17 {
    private static List<String> resList = new ArrayList<>();
    private static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {
        String digits = "249";
        TelNumber_17 telNumber = new TelNumber_17();
        telNumber.letterCombinations(digits);
    }

    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");

        if (digits.length() == 0) {
            return Collections.emptyList();
        } else {
            char[] chars = new char[digits.length()];
            for (int i = 0; i < digits.length(); i++) {
                chars[i] = digits.charAt(i);
            }
            List<String> tempList = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                tempList.add(hashMap.get(chars[i]));
            }
            backStracking(0, tempList);
            System.out.println(resList);
            return resList;
        }
    }

    public static void backStracking(int n, List<String> tempList) {
        if (n > tempList.size() - 1) {
            resList.add(stringBuffer.toString());
            return;
        }
        for (int i = 0; i < tempList.get(n).length(); i++) {
            stringBuffer.append(tempList.get(n).charAt(i));
            backStracking(n + 1, tempList);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
    }
}
