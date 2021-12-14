package com.reverseInt_7;

import java.util.ArrayList;
import java.util.List;

public class ReverseInt_7 {

    public static void main(String[] args) {
        int x = 456863;
        System.out.println("reverse(x) = " + reverse(x));
    }

    public static int reverse(int x) {
        //利用转字符串法，然后用charAt()来处理
        /*
        1、将字串 String 转换成整数 int
        1). int i = Integer.parseInt([String]);
        2). int i = Integer.valueOf(my_str).intValue();
        注: 字串转成 Double, Float, Long 的方法大同小异.

        2、将整数 int 转换成字串 String
        1.) String s = String.valueOf(i);
        2.) String s = Integer.toString(i);
        3.) String s = "" + i;
         */
        List<Character> list = new ArrayList<>();
        if (x < 0) {
            list.add('-');
            x = Math.abs(x);
        }
        String str = Integer.toString(x);  //将整数转化为字符串
        for (int i = str.length() - 1; i >= 0; i--) {
            list.add(str.charAt(i));
        }
        StringBuffer stringBuffer = new StringBuffer();  //利用stringBuffer将list里的字符拼接起来
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i));
        }
        try {
            String resStr = stringBuffer.toString();  //将stringBuffer里的内容转化成字符串
            int res = Integer.parseInt(resStr);  //将字符串转化为整数
            return res;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}

