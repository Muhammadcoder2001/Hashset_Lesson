package HashSet;

import java.util.HashSet;

public class TAsk8 {

    public static void main(String[] args) {

        HashSet <Integer> list = new HashSet<>();
        list.add(17);
        list.add(72);
        list.add(6);
        list.add(5);
        list.add(0);

        HashSet <Integer> numbers = new HashSet<>();

        numbers.add(17);
        numbers.add(72);
        numbers.add(6);
        numbers.add(5);
        numbers.add(0);

        if(list.equals(numbers)){
            System.out.println("Objects are equal");
        }else {
            System.out.println("Objects are not equal");
        }
        numbers.remove(17);
        if(list.equals(numbers)){
            System.out.println("Objects are equal");
        }else {
            System.out.println("Objects are not equal");
        }

    }
}
