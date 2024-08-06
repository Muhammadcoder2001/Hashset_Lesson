package HashSet;

import java.util.EnumMap;
import java.util.HashSet;

public class UPG_Employee {
    private String name;
    private String _id;
    private String position;

    public UPG_Employee(String name, String _id, String position){
        this._id = _id;
        this.name = name;
        this.position = position;

    }



    public static void main(String[] args) {

        UPG_Employee employee = new UPG_Employee("Islom", "162t", "Senior Software engineer");

        HashSet<UPG_Employee> users = new HashSet<>();

        users.add(employee);
        System.out.println(users);

    }

}