package Easy;

public class ThreeConsecutiveOdds1550BestSol {
    public static void main(String[] args) {
        int arr[] = {1,2,34,3,4,5,7,23,12};
        System.out.println("Check "+checkThreeConsecutiveOdds(arr));
    }
    public static boolean checkThreeConsecutiveOdds(int[] arr) {
        for (int i=0;i<arr.length-2;i++){
//            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
//                return true;
//            }

            if( (arr[i]&1) == 1 && (arr[i+1]&1) == 1 && (arr[i+2]&1) == 1){
return true;
            }
        }

        return false;}
    }
