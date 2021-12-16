package com.romanToInteger_13;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        // 创建空白数组byte1，存储s的每一个字符
        byte[] byte1 = new byte[s.length()];
        // 创建整数数组，存储按照字典转换之后的数字
        int[] arr = new int[s.length()];
        // 循环地取出String中的字符存入byte1
        for (int i = 0; i < s.length(); i++) {
            byte1[i] = (byte) s.charAt(i);
        }
        // 通过switch判断给int[]数组赋值
        for (int i = 0; i < byte1.length; i++) {
            switch (byte1[i]) {

                case 'M':
                    arr[i] = 1000;
                    continue;
                case 'D':
                    arr[i] = 500;
                    continue;
                case 'C':
                    arr[i] = 100;
                    continue;
                case 'L':
                    arr[i] = 50;
                    continue;
                case 'X':
                    arr[i] = 10;
                    continue;
                case 'V':
                    arr[i] = 5;
                    continue;
                case 'I':
                    arr[i] = 1;
                    continue;
            }
        }
        // 循环地对int[]中的元素进行判断，如果后面一个数大于前面一个数，
        // 就要把前面一个数变成负的
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                arr[i] = -arr[i];
            } else {
                continue;
            }
        }
        int sum = 0;
        //循环累加求和
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
