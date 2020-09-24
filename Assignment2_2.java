package edu.neu.INFO5100;
/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class Assignment2_2 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public int maxSubArray(int[] nums) {
        //write your code here
        int[] arrayTemp = new int[nums.length];
        arrayTemp[0] = nums[0];
        int largest = nums[0];
        for (int i = 1; i < arrayTemp.length; i++) {
            if (arrayTemp[i - 1] <= 0) {
                arrayTemp[i] = nums[i];
            } else {
                arrayTemp[i] = arrayTemp[i - 1] + nums[i];
            }
            if (arrayTemp[i] > largest) {
                largest = arrayTemp[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        //write your code here
        // Test 1

        int[] numsTest1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assignment2_2 assignment2_2 = new Assignment2_2();
        System.out.println("Test 1 largest sum is: "+assignment2_2.maxSubArray(numsTest1));
        // Test2
        int[] numsTest2 = {4, -1, 2, 1};
        System.out.println("Test 2 largest sum is: "+assignment2_2.maxSubArray(numsTest2));
        // Test3
        int[] numsTest3 = {1};
        System.out.println("Test 3 largest sum is: "+assignment2_2.maxSubArray(numsTest3));
    }
}
