package JavaCore.Fifth;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, JavaCore.Sixth.Train.Person {
    //instance fields
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
//      Objects.requireNonNull(n, "The name cannot be null");
        super(n);
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String n, double s) {
        super(n);
        salary = s;
    }

    public Employee(String n) {
        super(n);
    }
    //other methods
    //字段访问器

    public int getId() {
        return id;
    }

//    //将方法声明为final，子类就不能覆盖这个方法
//    public final String getName() {
//        return name;
//    }

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
//    public boolean equals(Employee other) {
//        return super.getName().equals(other.getName());
//    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public boolean equals(Object otherObject) {
        //a quick test to see if the objects are identical
        if (this == otherObject) return true;

        //must return false if the explicit parameter is null
        if (otherObject == null) return false;

        //if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) {
            System.out.println("The classes are different");
            return false;
        }
        //now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        //test whether the fields have identical values
//        return getName().equals(other.getName())
//                && salary == other.salary
//                && hireDay.equals(other.hireDay);

        //to avoid that name or hireDay is null
        return Objects.equals(getName(), other.getName())
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(getName(), salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name=" + getName() + ", salary=" + salary + ",hireDay="
                + hireDay + "]";
    }

    /**
     * Compares employees by salary
     * @param o another Employee object
     * @return a negative value if this employee has a lower salary than o,
     * 0 if the salaries are the same, a positive value otherwise
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
