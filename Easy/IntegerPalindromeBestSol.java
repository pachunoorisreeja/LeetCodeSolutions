package Easy;

public class IntegerPalindromeBestSol {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(2332));
    }
    public static boolean checkPalindrome(int x){
        if(x < 0 || (x%10 ==0 && x!=0)){
            return false;

        }
        int reverseTillMid =0;
        while (x> reverseTillMid){
            reverseTillMid = reverseTillMid*10+x%10; //  1221;  1, 12 x=12
            x=x/10;                                  // 122, 12, reverseTillMid =12

        }
        if(reverseTillMid/10 == x || reverseTillMid==x){
            return true;
        }
        return false;
    }
/*
Time Complexity: O(log₁₀(n))
✅ Space Complexity: O(1)
 */


}
