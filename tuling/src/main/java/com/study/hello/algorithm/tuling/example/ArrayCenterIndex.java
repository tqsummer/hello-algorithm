package com.study.hello.algorithm.tuling.example;

/**
 * @author : fangxiangqian
 * @created : 2023/11/9
 **/
public class ArrayCenterIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3,6, 5, 6};
        int i = pivotLeftIndex(nums);
        System.out.println(i);
    }

    private static int pivotLeftIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum == sum) {
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }

    private static int pivotRightIndex(int[] nums) {
        int sum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum += nums[i];
            if (rightSum == sum) {
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }
}
