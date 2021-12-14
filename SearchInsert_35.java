package com.searchInsert_35;

public class SearchInsert_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println("插入的索引为：" + searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;  //left和right更新之后，下一轮循环，mid也随之更新
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //以下代码都不会出现等于的情况，因为确定找不到了才会走到这里
        left = 0;
        right = nums.length - 1;
        int res = 0;
        while (left <= right) {
            int mid = (left + right) / 2;  //left和right更新之后，下一轮循环，mid也随之更新
            if (mid + 1 <= nums.length - 1) {  //如果mid + 1没有越界，或者说mid还没到数组中最后一个元素
                if (nums[mid] < target && nums[mid + 1] > target) {
                    res = mid + 1;
                    break;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {  //说明此时nums[mid]已经是数组中最后一个元素了，也是最大的一个元素，只要这个元素小于target直接返回mid+1就行了，也没有nums[mid+1]了
                if (nums[mid] < target) {
                    res = mid + 1;
                    break;
                } else if (nums[mid] > target) {
                    res = mid;
                    break;
                }
            }
        }
        return res;
    }
}
