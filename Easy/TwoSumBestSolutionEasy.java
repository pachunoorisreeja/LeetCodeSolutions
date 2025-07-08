package Easy;

public class TwoSumBestSolutionEasy {
    public static void main(String[] args) {
        int target = 7;
        int arr[] = {1, 4, 6, 7, 32};
        //int val[] = new int[2];

for (int i=0;i<arr.length;i++){
    for (int j=i;i<arr.length;i++){
        if (arr[i]+arr[j] ==  target){
            arr[0] = i;
            arr[1] = j;
            break;
        }
    }
}
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

}
