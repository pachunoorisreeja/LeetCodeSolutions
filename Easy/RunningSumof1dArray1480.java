package Easy;

public class RunningSumof1dArray1480 {
    public static void main(String[] args) {
        int[] n = runningSum(new int[]{1,2,3,4});
    }
    public static int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            result[i] = sum;
        }
        return result;}
}
