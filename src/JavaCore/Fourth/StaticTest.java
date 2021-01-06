package JavaCore.Fourth;

public class StaticTest {
    public static void main(String[] args) {
        var staff = new Employee[3];
        staff[0] = new Employee("Tom", 4000);
        staff[1] = new Employee("Dick", 6000);
        staff[2] = new Employee("Harry", 6500);
        //print out information about all Employee objects
        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ", id=" + e.getId() +
                    ", salary=" + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}
