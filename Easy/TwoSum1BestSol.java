package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1BestSol {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target =9;
        int result[] = test(arr, target);
        System.out.println("result :"+result[0]+" "+result[1]);
    }

public static int[] test(int arr[], int target){

    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0;i<arr.length;i++){
        int complement = target -arr[i];
        if (map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(arr[i], i);
    }
    return new int[]{-1,-1};

}
}
