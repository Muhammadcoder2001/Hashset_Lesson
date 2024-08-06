package HashSet;

import java.util.HashSet;

public class TAsk7 {

    public static void main(String[] args) {

        HashSet <Integer> list = new HashSet<>();
        list.add(17);
        list.add(72);
        list.add(6);
        list.add(5);
        list.add(0);
        for (Integer s : list){
            if (s < 7){
                System.out.println(s);
            }
        }
    }
}
