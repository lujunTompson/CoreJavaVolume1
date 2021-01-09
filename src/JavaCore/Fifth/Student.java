package JavaCore.Fifth;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return getName() + " majoring in " + major;
    }
}
