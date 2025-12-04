package Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII217 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        method1(nums);
        method2(nums);
    }

    public static boolean method1(int[] nums) {
       /* Time & Space Complexity
        Time: O(n) — one pass through array, add() in HashSet is O(1) on average
        Space: O(n) — worst case all unique elements stored in HashSet*/
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }

        return false;
    }
    public static boolean method2(int[] nums) {
       /* Time & Space Complexity
        Approach	Time Complexity	Space Complexity
        HashSet (previous)	O(n)	O(n)
        Sorting (this one)	O(n log n)	O(1) (if in-place sort)*/
        Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
           if(nums[i-1]==nums[i]){
               return true;
           }
       }
        return false;
    }

}