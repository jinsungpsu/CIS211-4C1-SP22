public class CallStackDemo {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        method1();
    }

    static void method1() {
        int num1 = 3;
        int num2 = 6;
        method2();
    }

    static void method2() {
        int num1 = 4;
        int num2 = 7;
        method3();

    }

    static void method3() {
        int num1 = 5;
        int num2 = 8;
    }
}
