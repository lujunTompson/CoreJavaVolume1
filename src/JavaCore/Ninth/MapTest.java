package JavaCore.Ninth;

import JavaCore.Fifth.Employee;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        var staff = new HashMap<String, Employee>();
        //将键值对添加到HashMap中
        staff.put("1423", new Employee("Harry"));
        staff.put("2546", new Employee("Hacker"));
        staff.put("5467", new Employee("Cooper"));
        staff.put("7832", new Employee("Tom"));

        //print all elements
        for (String element : staff.keySet())
            System.out.println(element);
        for (Employee employee : staff.values())
            System.out.println(employee);

        //remove an entry
        staff.remove("2546");
        //replace an entry
        staff.put("5467", new Employee("Gary"));
        //look up a value
        System.out.println(staff.get("1423"));
        //iterate through all entries
        staff.forEach((k, v) -> System.out.println("k=" + k + ", v=" + v));


    }
}
