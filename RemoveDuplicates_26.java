package com.removeDuplicates_26;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int k = removeDuplicates(nums);
        System.out.println("k = " + k);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        //1.列表刚开始是空的，判断如果集合中(!contains)即没有nums[i]这个元素，就把nums[i]这个元素加入列表
        //如果已经有了，那就不加入，这样不就实现了去重的功能么
        //2.或者直接用集合来做，集合具有不重复性
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
//		System.out.println("去除重复后的list集合"+list);

//		for(int i=0;i<list.size();i++) {
//			nums[i] = list.get(i);
//		}
//		for(int i=list.size();i<nums.length;i++) {
//			nums[i] = -1;
//		}

        System.out.println(list.toString());  //列表打印

//		System.out.println(Arrays.toString(nums));

        int k = list.size();

        return k;
    }

//	public static int removeDuplicates(int[] nums) {
//		int count = 0;
//		for(int i=0;i<nums.length;) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[i] == nums[j]) {
//					nums[j] = -1;
//					count++;
//				}
//			}
//
//			//每次内层循环结束后，将i移动到i+count+1的位置继续遍历，注意要去掉for循环里的i++
//			if(i+count+1<nums.length) {
//				i=i+count+1;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
//		return nums.length;
//	}
}
