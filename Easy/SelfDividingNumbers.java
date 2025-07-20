package Easy;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        List<Integer> list = selfdividingNumbers(1,25);
        System.out.println(list);
        for(int a:list){
            System.out.println(a);
        }
    }





public static List<Integer> selfdividingNumbers(int left, int right) {
List<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {
        if (test(i)) {
            list.add(i);
        }


    }
return list;
}
public static boolean test(int i){
    int rem = 0;
    int originalNumber =i;
    while (i>0) {
        rem = i % 10;
        if ( rem == 0 || originalNumber % rem != 0)
            return false;
        i = i / 10;

    }
   return true;
}

}