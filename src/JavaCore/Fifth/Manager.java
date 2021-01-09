package JavaCore.Fifth;

import java.time.LocalDate;
import java.util.Objects;


public class Manager extends Employee {
    private double bonus;

    /**
     * @param n     the employee's name
     * @param s     the employee's salary
     * @param year  the hire year
     * @param month the hire month
     * @param day   the hire day
     */
    public Manager(String n, double s, int year, int month, int day) {
        //必须是子类构造器的第一条语句
        super(n, s, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        //调用超类的方法
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}



