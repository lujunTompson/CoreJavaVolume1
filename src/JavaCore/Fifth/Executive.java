package JavaCore.Fifth;

//不允许扩展的类在声明时使用final修饰符
public final class Executive extends Manager {
    private int departmentId;

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Executive(String n, double s, int year, int month, int day, int departmentId) {
        super(n, s, year, month, day);
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return super.toString() + "[departmentId=" + departmentId + "]";
    }
}
