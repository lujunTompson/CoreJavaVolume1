package JavaCore.Fifth.ObjectAnalyzer;

import JavaCore.Fifth.Employee;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i <= 6; i++)
            squares.add(i * i);
        var harry = new Employee("Harry Hacker", 5000, 10, 1, 1);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
