package JavaCore.Fourth;

import java.util.Objects;

/**
 * @author chaowang
 * @version the first part
 * @see JavaCore.Fourth.Train.PackageTest#main(String[])
 * @see <a href="https://blog.csdn.net/g6u8w7p06dco99fq3/article/details/105985092">the special part</a>
 * {@link JavaCore.Fourth.Train.ConstructorTest#main(String[])}
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
        Test 1: Methods cannot modify numeric parameters
         */
        EmployeeTest.main(new String[]{});
        System.out.println("Testing tripleValue:");
        double percent = 10.0;
        System.out.println("Before, percent=" + percent);
        tripleValue(percent);
        System.out.println("After, percent=" + percent);

        /*
        Test 2: Methods can change the state of object parameters
         */
        System.out.println("Testing tripleSalary:");
        Employee2 a = new Employee2("Alice", 50000.0);
        Employee2 b = new Employee2("Bob", 40000.0);
        System.out.println("Before, salary=" + a.getSalary());
        tripleSalary(a);
        System.out.println("After, salary=" + a.getSalary());

        /*
        Test 3: Methods can't attach new objects to object parameters
         */
        System.out.println("Testing swap:");
        System.out.println("Before, a=" + a.getName());
        System.out.println("Before, b=" + b.getName());
        swap(a, b);
        System.out.println("After, a=" + a.getName());
        System.out.println("After, b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of method: x=" + x);
    }
    public static void tripleSalary(Employee2 e) {
        e.raiseSalary(200);
        System.out.println("End of method: salary=" + e.getSalary());
    }
    public static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

/**
 *
 */
class Employee2
{
    private String name;
    private double salary;

    public Employee2(String n, double s) {
        Objects.requireNonNull(n, "The name cannot be null");
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Raise the salary of an employee
     * @param byPercent the percentage by which to raise the salary (e.g., 10 means 10%)
     * @return the amount of the raise
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
