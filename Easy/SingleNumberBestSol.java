package Easy;

public class SingleNumberBestSol {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,3,2,1}));
    }
    public static int singleNumber(int[] nums) {
        int result=0;
    for(int n: nums){
        result^=n;

    }
return result;
    }
/*
Time complexity: O(n)

Space complexity: O(1)

Uses no extra data structures — only a simple integer.
 Why does XOR work?
XOR properties:

a ^ a = 0 (same numbers cancel each other)

a ^ 0 = a

XOR is commutative and associative.

So, doing XOR across all numbers:

Copy
Edit
(4 ^ 1 ^ 2 ^ 1 ^ 2)
= (1 ^ 1) ^ (2 ^ 2) ^ 4
= 0 ^ 0 ^ 4
= 4
 */


}
