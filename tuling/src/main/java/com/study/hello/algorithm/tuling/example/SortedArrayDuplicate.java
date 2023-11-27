package com.study.hello.algorithm.tuling.example;

/**
 * @author : fangxiangqian
 * @created : 2023/11/9
 **/
public class SortedArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

        return i + 1;
    }
}
