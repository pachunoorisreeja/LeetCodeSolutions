package Easy;

import java.util.*;
public class TwoSumBestSolution {
    public static void main(String[] args) {
        int target = 7;
        int arr[] = {1,4,6,7,32};
        int val[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            int anotherValue = target - arr[i];
            if (map.containsKey(anotherValue)) {
                val[0] = map.get(anotherValue);
                val[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(val[0]);
        System.out.println(val[1]);
    }
/*
Time Complexity: O(log₁₀(n))
✅ Space Complexity: O(1)
 */


}
