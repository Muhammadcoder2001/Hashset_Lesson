package HashSet;

import java.util.HashSet;

public class TAsk1 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Pink");
        list.add("Green");
        list.forEach(s-> {
            System.out.println(s);
        });

        System.out.println(list);
    }
}
