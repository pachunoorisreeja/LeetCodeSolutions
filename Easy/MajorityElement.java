package Easy;

import java.util.Stack;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int value = nums.length/2;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    count++;
                }
               }
            if (count > value){
                count = nums[i];
                break;
            }

    }
      return count;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,3,4,2,1,2}));

    }
}
