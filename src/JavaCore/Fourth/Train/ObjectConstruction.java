package JavaCore.Fourth.Train;

public class ObjectConstruction {

}

class Employee2 {
    private static int nextId;
    //利用方法调用初始化一个字段
    private int id = assignId();

    private static int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }
}