package com.yanghui_118;

import java.util.ArrayList;
import java.util.List;

public class Yanghui_118 {
    public static void main(String[] args) {
        int numRows = 14;
        generate(numRows);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> innerlist = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == 0) {  //如果是第一行
                    innerlist.add(1);
                } else {
                    int value = 0;
                    if (j >= 1) {
                        value += outerList.get(i - 1).get(j - 1);
                    }
                    if (j < i) {
                        value += outerList.get(i - 1).get(j);
                    }
                    innerlist.add(value);
                }
            }
            outerList.add(innerlist);
        }
        for (List<Integer> link : outerList) {
            for (int i = 0; i < link.size(); i++) {
                System.out.printf("%6d", link.get(i));
            }
            System.out.println();
        }

//        System.out.println(Arrays.toString(new List[]{outerList}));
        return outerList;
    }
}

