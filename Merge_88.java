package com.merge_88;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merge_88 {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        m ==> nums1的==有效==元素个数
        n ==> nums2的==有效==元素个数
        nums1的总长度为 m + n
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m + n - n; i++) {  //或是nums1.length - 1 - n
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < m + n; i++) {  //nums1的长度为m + n
            nums1[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums1));
    }
}

