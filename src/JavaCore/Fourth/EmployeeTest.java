package JavaCore.Fourth;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Potter", 7500, 1987, 8, 11);
        staff[1] = new Employee("Harry Hacker", 7500, 1987, 8, 11);
        staff[2] = new Employee("Carl Cracker", 7500, 1987, 8, 11);

        //raise everyone's salary by five percent
        for (Employee employee : staff) {
            employee.setId();
            employee.raiseSalary(5);
        }

        //print out the information about all employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay="
                    + e.getHireDay());

        System.out.println(Employee.getNextId());
    }

}

class Employee {
    //instance fields
    private final String name;
    private double salary;
    private LocalDate hireDay;
    private int id;
    //静态字段
    private static int nextId = 1;

    //静态方法,使用类调用即可
    public static int getNextId() {
        return nextId;
    }

    //constructor
    public Employee(String n, double s, int year, int month, int day) {
        //严格型,n禁止为null
        Objects.requireNonNull(n, "The name cannot be null");
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    //other methods
    //字段访问器

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    //字段更改器方法
    public void setId() {
        id = nextId;
        nextId++;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100.0;
        salary += raise;
    }

    //可以访问任何Employee类型对象的私有字段
    public boolean equals(Employee other) {
        return name.equals(other.name);
    }

    public static void main(String[] args) {
        var e = new Employee("Romeo", 50000, 2003, 3, 31);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
