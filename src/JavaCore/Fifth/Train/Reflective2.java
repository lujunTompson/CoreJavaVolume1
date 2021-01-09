package JavaCore.Fifth.Train;

import JavaCore.Fifth.Employee;

import java.lang.reflect.Field;

public class Reflective2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var harry = new Employee("Harry Hacker", 5000, 10, 1, 1);
        // the class object representing Employee
        Class cl = harry.getClass();
        // the name field of the Employee class
        Field f = cl.getDeclaredField("salary");
        f.setAccessible(true);
        Object v = f.get(harry);
        System.out.println(v);
    }
}