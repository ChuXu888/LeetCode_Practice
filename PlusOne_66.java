package com.plusOne_66;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        PlusOne_66 plusOne = new PlusOne_66();
        int[] res = plusOne.plusOne_66(digits);
        System.out.println(Arrays.toString(res));
    }

    public int[] plusOne_66(int[] digits) {
        //将最后一个数字不是9的情况在这里处理掉，剩下最后一个数字是9的情况，又包括全为9和不全为9两种情况
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
        } else {
            //判断是否数组中元素全都为9
            int countOf9 = 0;  //局部变量定义时需要初始化
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] == 9) {
                    countOf9++;
                }
            }

            if (countOf9 == digits.length) {  //如果全为9进行if里面的操作
                digits = new int[digits.length + 1];
                digits[0] = 1;
            } else {  //如果不全为9进行else里面的操作
                backStracking(digits, digits.length - 1);
            }
        }
        return digits;
    }

    public void backStracking(int[] digits, int curIndex) {
        if (digits[curIndex] != 9) {  //回溯掉头的条件
            digits[curIndex]++;
            return;
        } else {
            digits[curIndex] = 0;  //回溯的主操作
            backStracking(digits, curIndex - 1);  //进入回溯
        }
    }
}
