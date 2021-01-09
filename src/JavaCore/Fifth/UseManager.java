package JavaCore.Fifth;

public class UseManager {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 50000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        //既可以引用Employee类型又可以引用Manager类型（可以引用子类的对象）
        staff[0] = new Employee("Harry Hacker", 50000, 1987, 12, 15);
        staff[0] = boss;

        System.out.println(staff[0].getSalary());
        staff[1] = new Employee("Harry Hacker", 50000, 1987, 12, 15);
        staff[2] = new Employee("Harry Hacker", 50000, 1987, 12, 15);
        for (Employee e : staff)
            System.out.println(e.getName() + " " + e.getSalary());

        Manager[] managers = new Manager[10];

        Employee[] staff2 = new Employee[3];
        staff2[0] = new Manager("Harry Hacker", 50000, 1987, 12, 15);
        staff2[1] = new Manager("Harry Hacker", 50000, 1987, 12, 15);
        staff[2] = new Employee("Harry Hacker", 50000, 1987, 12, 15);
        Manager m = (Manager) staff2[0];
        Manager m2 = (Manager) staff2[1];
        if (staff2[0] instanceof Manager)
        {
            boss = (Manager) staff2[1];
            System.out.println("成功了");
        }

        if (!m.equals(m2))
            System.out.println("失败");

        if (boss instanceof Employee) {
            System.out.println("Manager is Employee class");
        }
    }
}
