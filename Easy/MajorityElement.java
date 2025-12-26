package Easy;
//https://leetcode.com/problems/majority-element/description/
import java.util.HashMap;
import java.util.Stack;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = nums.length/2;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                //majority = hash.get(n);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,3,4,2,1,2}));

    }
}
