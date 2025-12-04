package Easy;

public class ReverseString344 {
    public static void main(String[] args) {
        char c[]={'h','e','l','l','o'};
        reverStringOfChars(c);

    }
    public static void reverStringOfChars(char[] s){
        int left =0, right = s.length-1;
        while (left<right){
            char c =s[left];
            s[left] = s[right];
            s[right]=c;
            left++;right--;
        }
        System.out.println("Resersed String is "+new String(s));}
}
