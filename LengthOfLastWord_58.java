package com.lengthOfLastWord_58;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int count = lengthOfLastWord(s);
        System.out.println("count = " + count);
    }
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
//        System.out.println(Arrays.toString(str));
//        String resStr = str[str.length - 1];
//        int count = str[str.length - 1].length();
        return str[str.length - 1].length();
    }
}
