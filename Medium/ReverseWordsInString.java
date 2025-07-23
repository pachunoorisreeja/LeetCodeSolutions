package Medium;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String str[] = s.split("\\s+");
        int left = 0;
        int right = str.length - 1;
        while (left < right) {
            String c = str[left];
            str[left] = str[right];
            str[right] = c;
            left++;
            right--;
        }
        String target = "";
        for (int i = 0; i < str.length; i++) {

            if (i == str.length - 1) {
                target = target + str[i];
                break;
            }

            target = target + str[i] + " ";

        }
        return target;
    }
}
