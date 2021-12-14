package com.isPalindrome_9;

public class IsPalindrome_9 {

    public static void main(String[] args) {
        int x = 12321;
        boolean res = isPalindrome(x);
        System.out.println(res);
    }

    private static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        // 创建空白数组byte1，存储x的每一个字符
        byte[] byte1 = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            byte1[i] = (byte) str.charAt(i);
        }

        // 创建空白数组byte2，存储x的逆序字符
        byte[] byte2 = new byte[str.length()];

        for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--) {
            byte2[i] = byte1[j];
        }

        for (int i = 0; i < str.length(); i++) {
            if (byte1[i] != byte2[i]) {
                return false;
            }
        }
        return true;
    }
}
