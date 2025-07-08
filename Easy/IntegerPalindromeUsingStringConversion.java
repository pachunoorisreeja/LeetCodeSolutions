package Easy;

public class IntegerPalindromeUsingStringConversion {
    public static void main(String[] args) {
        System.out.println("given number is "+checkPalindrome(12321));
    }
    public static boolean checkPalindrome(int x) {
        String number = String.valueOf(x);
        int left = 0, right = number.length() - 1;
        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
