package JavaCore.Fifth.Train;

import JavaCore.Fifth.Employee;

import java.lang.reflect.InvocationTargetException;

public class Reflective {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        Employee e = new Employee("Harry Hacker", 50000, 1984, 5, 11);
        //法一：通过对象来获得
        Class cl = e.getClass();
        System.out.println(cl.getName());
        //法二：由字符串获得类名
        String className = "java.util.Random";
        Class cl2 = Class.forName(className);
        //法三：java类型获得相匹配的类对象
        Class employeeClass = Employee.class;
        Class cl3 = int.class;

        //使用Class对象构造类的实例
        Object obj = cl2.getConstructor().newInstance();

    }
}
