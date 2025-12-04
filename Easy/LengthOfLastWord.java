package Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s ="Hello World";
        OptimalSolution(s);
        method2(s);
    }

public static void OptimalSolution(String s){
int i = s.length()-1;
int len=0;
while (i>=0 && s.charAt(i)==' '){
    i--;
}
    while (i>=0 && s.charAt(i)!=' '){
        len++;
        i--;
    }
    System.out.println("Length of last word is "+len);
}

    public static void method2(String s){
        String ss[] = s.split("\\s+");
        System.out.println("Length of last word is "+ss[ss.length-1].length());

    }

}