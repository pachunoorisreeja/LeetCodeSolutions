package Easy;
import java.util.Scanner;
public class isValidWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String word) {
        char chars[] = word.toCharArray();
        boolean isVowel = false;
        boolean isConsonant =  false;
        boolean isDigit = false;
        if(word.length()<3)
            return false;
        for(char c:chars){
            if((int)c >47 && (int)c <=57){
                isDigit = true;
            }
            else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                isVowel = true;
            }
            else if(((int)c >=97 && (int)c<=122)|| ((int)c >=65 && (int)c <=90) ){

                isConsonant = true;
            }
            else{
                return false;
            }
        }
        return (isVowel && isConsonant);
    }
}
