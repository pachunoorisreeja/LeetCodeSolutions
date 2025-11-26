package Easy;

public class MissingNumber268BestSol {
    public static void main(String[] args) {
int nums[] ={3,0,1};
        System.out.println("Missing Number is: "+missingNumber(nums));

    }
    public static int missingNumber(int arr[]){
        int sum = arr.length*(arr.length+1)/2;
        for(int i:arr){
            sum-=i;
        }
        return sum;
    }

}
