package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumBestSolutionBestSol1 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1,7,2,3,4},9));
    }
/*
Time Complexity: O(log₁₀(n))
✅ Space Complexity: O(1)
 */
public static int[] twoSum(int[] nums, int target) {
    for(int i = 1 ; i < nums.length ; i++) {
        for(int j = i ; j < nums.length ; j++) {
            if(nums[j] + nums[j-i] == target) {
                return new int[]{j,j-i};
            }
        }
    }
    return new int[]{};
}

}
