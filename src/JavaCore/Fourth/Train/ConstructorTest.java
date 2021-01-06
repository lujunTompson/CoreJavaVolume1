package JavaCore.Fourth.Train;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {

    }
}

class Employee
{
    private static int nextId;
    private int id;
    // instance field initialization
    private String name = "";
    private double salary;

    // static initialization block
    static
    {
        //构造一个新的随机数生成器
        Random generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //object initialization block, 初始化代码放在构造器中最好
    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructors
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        //calls the Employee(String, double) constructor
        this("Employee #" + nextId, salary);
    }

    public Employee() {
        // name : instance field initialization
        // salary : not explicitly set to 0
        // id : object initialization block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
