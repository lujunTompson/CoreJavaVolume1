package JavaCore.Fifth;

/**
 * This program demonstrates abstract classes.
 * @version 1.01
 * @author chaowang
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        //fill the people array with student and employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1984, 5, 11);
        people[1] = new Student("Maria Morris", "computer science");
        //print out names and descriptions of all Person objects
        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());

        Employee e1 = (Employee) people[0];
        Employee e2 = new Employee("Harry Hacker", 50000, 1988, 5, 11);
        if (!e1.equals(e2)) {
            System.out.println("use the otherObject equals method");
        }
        else {
            System.out.println("use the Employee equals method");
        }
    }
}
