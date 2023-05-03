package addressbook.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Akash",25,"CS");
        Employee employee2 = new Employee("Rahul",24,"IT");
        Employee employee3 = new Employee("Rahul", 26,"CS");

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);

        arrayList.forEach(i-> System.out.println(i));
    }
}
