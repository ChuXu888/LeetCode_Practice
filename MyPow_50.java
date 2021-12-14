package com.myPow_50;

public class MyPow_50 {
    public static void main(String[] args) {
        double x = 1.5;
        int n = 10;
        System.out.println(x + " ^ " + n + " = " + myPow(x, n));
    }

    public static double myPow(double x, int n) {
        long N = n;  //long是长整型，表示的范围比int要广，但仍是整数
        if (N >= 0) {
            return backStracking(x, N);
        } else {
            return 1 / backStracking(x, -N);
        }
    }

    public static double backStracking(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = backStracking(x, N / 2);
        if (N % 2 == 0) {  //此时y=根号x^n
            return y * y;  //因为y是double型，所以返回的也是double型
        } else {  //此时y=根号x^(n-1)，所以平方后还要再乘以x
            return y * y * x;
        }
    }
}

