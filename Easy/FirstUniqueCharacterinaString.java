package Easy;
import java.util.*;
public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        char target = '-';
        char c[] = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        if(s.length()==1){
            return 0;
        }
        if(s.length()==2 && s.charAt(0)==s.charAt(1)){
            return -1;
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);

            }else{
                map.put(s.charAt(i),1);
            }

        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                target= entry.getKey();
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
