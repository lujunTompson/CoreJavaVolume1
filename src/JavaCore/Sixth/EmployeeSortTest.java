package JavaCore.Sixth;

import JavaCore.Fifth.Employee;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Harry", 5000);
        staff[1] = new Employee("Carl", 7500);
        staff[2] = new Employee("Tony Tester", 3800);
        Arrays.sort(staff);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());

    }
}
