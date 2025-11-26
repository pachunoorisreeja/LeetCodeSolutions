package Easy;

public class movesZerosToEnd283BestSol {
    public static void main(String[] args) {
        int arr[] ={0,1,0,3,12} ;
       moveZeroes(arr);

    }
    public static void moveZeroes(int[] nums) {
        int insertionPosition = 0;

        for(int num : nums){
            if(num != 0){
                nums[insertionPosition++] = num;
            }
        }

        while(insertionPosition < nums.length ){
            nums[insertionPosition++] = 0;
        }
    for (int i: nums){
        System.out.println(i+" ");}
    }

}
