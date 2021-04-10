package JavaCore.Ninth;

public class Test1 {
    public static void main(String[] args) {
//        try {
//            System.out.println("Hello World");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("e");
//        }finally {
//            System.out.println("!");
//        }
        Test1 s = new Test2();
        System.out.println(new Test1().message());
        System.out.println(s.message());
    }

    Object message() {
        return "Hello";
    }
}

class Test2 extends Test1{
    String message() {
        return "worlds!";
    }
}