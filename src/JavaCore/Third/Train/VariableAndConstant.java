package JavaCore.Third.Train;

public class VariableAndConstant {
    public static void main(String[] args) {
        double salary;
        int vacationDays;
        long earthPopulation;
        boolean done;
        //变量名可以由字母和数字构成，但开头必须是字母
        int vacationDay1;

        //从变量初始值可推断出它的类型
        var trainDays = 5;
        System.out.println(trainDays);

        //常量，使用final定义常量
        final double CM_PER_INCH = 2.54;
        double paperWith = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
                paperWith * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

        //枚举类型，先定义枚举类型，然后声明这种类型的变量，初始化为其中一个值
        Size s = Size.LARGE;

    }
    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE;
    };
}
