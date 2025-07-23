package Medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
    public static int singleNumber(int[] nums) {


            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);

                } else{
                    map.put(nums[i],1);
                }

            }
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue()==1){
                    nums[0] = entry.getKey();
                }
            }
            return  nums[0];

    }
}
