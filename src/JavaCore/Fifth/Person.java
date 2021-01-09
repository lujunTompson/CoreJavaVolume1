package JavaCore.Fifth;

public abstract class Person {
    private String name;
    //抽象方法
    public abstract String getDescription();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
