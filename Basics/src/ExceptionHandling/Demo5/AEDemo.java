package ExceptionHandling.Demo5;

public class AEDemo {
    public static int divideByZero(int x) {
        try {
            int zero = x / 0;
            return zero;
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } finally {
            System.out.println("Even though returned finally gets executed");
        }
        return 0;
    }
}
