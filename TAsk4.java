package HashSet;

import java.util.HashSet;

public class TAsk4 {

    public static void main(String[] args) {

        HashSet <String> list = new HashSet<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Pink");
        list.add("Green");

        HashSet <String> list1 = new HashSet<>(list);
        HashSet <String> list2 = new HashSet<>();
        list2 = (HashSet<String>) list.clone();
        System.out.println(list2);
        System.out.println();
        System.out.println(list1);
    }
}
