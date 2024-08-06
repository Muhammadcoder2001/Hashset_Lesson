package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TAsk2 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Pink");
        list.add("Green");

        Iterator<String> list1 =list.iterator();
        while(list1.hasNext()){
            System.out.println(list1.next());
        }

    }
}
