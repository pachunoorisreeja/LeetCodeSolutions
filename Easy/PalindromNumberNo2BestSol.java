package Easy;

public class PalindromNumberNo2BestSol {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(test(x)?"Palindrome Number":"No a Palindrome Number");

    }
    public static boolean test(int number){
        if(number<0){
            return false;
        }else {
            int originalNumber = number;
            int rev =0;
            while (number!=0){
                rev =rev*10+number%10;
                number = number/10;

            }
            return originalNumber == rev;
        }

    }
}
