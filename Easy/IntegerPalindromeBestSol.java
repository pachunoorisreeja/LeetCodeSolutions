package Easy;

public class IntegerPalindromeBestSol {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(2332));
    }
    public static boolean checkPalindrome(int x){
        int reverse = 0;
        int originalNumber =x;
       if(x==0){
           return true;
       }
       if(x<0 || x%10 == 0){
           return false;
       }
       while (x>0){
           int reminder = x%10;
           reverse = reverse*10+reminder;
           x= x/10;
       }
       return x == originalNumber;
    }
/*
Time Complexity: O
✅ Space Complexity: O(1)
 */


}
