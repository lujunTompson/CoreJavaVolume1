package JavaCore.Fifth.Train;

import JavaCore.Fifth.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class TheArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        // java10 -->var
        var staff2 = new ArrayList<Employee>();
        // 如果没有使用var关键词，可以省去右边的类型参数
        ArrayList<Employee> staff3 = new ArrayList<>();

        //add elements
        staff.add(new Employee("Harry Hacker", 50000, 1987, 12, 15));
        staff.add(new Employee("Tom Tester", 50000, 1987, 12, 15));

        //初始容量传递给ArrayList构造器
        ArrayList<Employee> staff4 = new ArrayList<>(100);

        //return the number of elements in one arraylist
        System.out.println("staff has " + staff.size() + " elements");

        //确认数组列表的大小将保持恒定
        staff.trimToSize();

        //替换数组列表中已经加入的元素
        staff.set(0, new Employee("Tom Tester", 50000, 1987, 12, 15));

        //得到一个元素
        Employee e = staff.get(0);

        Scanner in = new Scanner(System.in);
        String answer = in.next();
        var list = new ArrayList<Employee>();
        while (!answer.equals("no")) {
            Employee x = new Employee("Tom Tester", 50000, 1987, 12, 15);
            list.add(x);
            System.out.println("Please input your next answer:");
            answer = in.next();
        }

        var a = new Employee[list.size()];
        list.toArray(a);

        //在数组列表中间插入一个元素
        int n = list.size() / 2;
        list.add(n, list.get(n));

        //删除一个元素
        Employee removeElement = list.remove(n);

        for (Employee m : list)
            System.out.println(m);
    }
}
