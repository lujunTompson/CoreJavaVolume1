package JavaCore.Third.Train;

public class Condition {
    public static void main(String[] args) {
        int yourSales = 200;
        int target = 100;
        String performance;
        int bonus;
        if (yourSales >= 2 * target) {
            performance = "Excellent";
            bonus = 1000;
        }
        else if (yourSales >= 1.5 * target) {
            performance = "Fine";
            bonus = 500;
        }
        else if (yourSales >= target) {
            performance = "Satisfactory";
            bonus = 100;
        }
        else {
            System.out.println("You're fired");
        }
    }
}
