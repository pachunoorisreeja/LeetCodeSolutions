package Easy;

public class DetectCapital520 {
    public static void main(String[] args) {
        System.out.println("detectCapitalUse "+detectCapitalUse("USA"));
    }
    public static boolean detectCapitalUse(String word) {
        int isUpperCase=0, isUpperLowerCase =0,isLowerCase=0;
        for(int i=1;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(i))){
                isUpperCase++;
            }
            else if( Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(word.charAt(i))){
                isLowerCase++;
            } else if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(i))){
                isUpperLowerCase++;
            }

        }
        if(isUpperCase == word.length()-1 || isLowerCase == word.length()-1 || isUpperLowerCase == (word.length()-1)){
            return true;
        } else{
            return false;
        }
    }
}
