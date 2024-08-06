package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task6 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Pink");
        list.add("Green");

        Set <String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);


    }
}
