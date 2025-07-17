package Easy;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");

        String name = "John";
        String list = "";
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                System.out.println(names.get(i));
                continue;

            }

        }
    }
}
