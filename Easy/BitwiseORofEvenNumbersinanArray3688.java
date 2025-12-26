package Easy;
//https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/description/
/*
You are given an integer array nums.

Return the bitwise OR of all even numbers in the array.

If there are no even numbers in nums, return 0.

Example 1:

Input: nums = [1,2,3,4,5,6]

Output: 6

Explanation:

The even numbers are 2, 4, and 6. Their bitwise OR equals 6.
 */

public class BitwiseORofEvenNumbersinanArray3688 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};
        int sum =0;
        for(int i:nums){
            if((i&1) == 0){
                sum = sum|i;
            }
        }
        System.out.println("Sum is "+sum);
    }
}
