package Easy;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        String ss[] = s.split(" ");
        String finalString = "";
        for(int i=0;i<ss.length;i++){
            char c[] = ss[i].toCharArray();
            for(int j=c.length-1;j>=0;j--){
                finalString+=c[j];
            }
            if(i<ss.length-1){
                finalString =finalString+" ";
            }

        } return finalString;
    }
}
