package HashSet;

import java.util.HashSet;

public class TASk3 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Pink");
        list.add("Green");
        if (list.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }

        System.out.println(list);
        System.out.println(list.size());
//        list.clear();
        list.removeAll(list);

        if (list.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
        System.out.println(list);
    }
}
