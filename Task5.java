package HashSet;

import java.util.HashSet;

public class Task5 {

    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Pink");
        list.add("Green");

        String[] new_array = new String [list.size()];
        list.toArray(new_array);

        for (String s : new_array){
            System.out.println(s);
        }
        System.out.println("###################################");
        for (int i = 0; i < new_array.length; i ++){
            System.out.println(new_array[i]);

        }
    }
}
