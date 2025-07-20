package Easy;

public class UglyNumberBestSol {
    public static void main(String[] args) {
        System.out.println(isUgly(15));
    }

    /*
    Time Complexity: O(log₁₀(n))
    ✅ Space Complexity: O(1)
     */
    public static boolean isUgly(int n) {
        if (n <=0){
            return false;
        }
        if (n==1){
            return true;
        }
        int arr[] = new int[]{2,3,5};
        for (int a:arr){
            while (n%a == 0){
                n = n/a;
            }
        }

    return n == 1;}

}
