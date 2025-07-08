package Easy;

public class IntegerPalindromeUsingNormalWay {
    public static void main(String[] args) {
        System.out.println("given number is "+checkPalindrome(120));
    }
    public static boolean checkPalindrome(int x){
        int rem =0, rev=0;
        int originalNumber =x;
        if (x<0 || (x%10 ==0 && x!=0)){
            return false;
        }
        while (x!=0){

            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        if(originalNumber == rev){
            return true;
        }
        return false;
    }



}
