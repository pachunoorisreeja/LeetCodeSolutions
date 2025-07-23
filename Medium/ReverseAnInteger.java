package Medium;

public class ReverseAnInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }
    /*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     */
    public static int reverseInteger(int n){
        int rem = 0;
        long rev= 0;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(rev > Integer.MIN_VALUE || rev < Integer.MAX_VALUE) {
            return 0;
        }
        return (int)rev;
    }
}
