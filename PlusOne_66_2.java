package com.plusOne_66;

import java.util.Arrays;

public class PlusOne_66_2 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        //经过思考，发现for循环内的判断已经可以判断出最一般的直接加1的情况，参见下面的第3点
        //所以外层的if可以删掉，多余了
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[i] == 9) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            } else {
                //按照逻辑来判断，此处else对应三种情况：
                //1.i == 0 && digits[i] != 9 ==> (>8,9,9,9) ==> 指向的不是9，当前数字加1
                //2.i != 0 && digits[i] == 9 ==> (8,7,>9,9) ==> 指向的是9，指针前移再判断
                //3.i != 0 && digits[i] != 9 ==> (8,7,>5,9) ==> 指向的不是9，当前数字加1
                //在==排除==掉i == 0 && digits[i] == 9这种情况之后
                //其实这三种情况归结为两种情况，就是你当前指向的这个数到底是不是9，是9那就变为0，指针前移再判断
                //如果不是9，那就把当前这个数加1，退出循环
                if (digits[i] == 9) {
                    digits[i] = 0;
                    continue;
                } else {
                    digits[i]++;
                    break;
                }
            }
        }
        return digits;
    }
}