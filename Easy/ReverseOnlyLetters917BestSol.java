package Easy;

public class ReverseOnlyLetters917BestSol {
    public static void main(String[] args) {
    String s ="ab-cd";
        System.out.println("Answer is :"+reverseOnlyLetters(s));
            //Output: "dc-ba"
     //Input: s = "a-bC-dEf-ghIj"
       // Output: "j-Ih-gfE-dCba"

    }
    public static String reverseOnlyLetters(String s){
        char cc[] = s.toCharArray();
        int left =0, right =s.length()-1;
        while (left < right){
            if(Character.isLetter(cc[left]) && Character.isLetter(cc[left])){
                char temp = cc[left];
                cc[left] = cc[right];
                cc[right] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(cc[left])) {
                left++;

            }else{
                right--;
            }
        }
        return new String(cc);
    }
}
