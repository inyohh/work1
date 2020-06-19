package lab_2_2.work1;

public class work1 {
    public static void main(String[] args) {
        int i = 1;
        while (Fibonacci.of(i) < 200) {
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
            i++;
        }
    }

    public static class Fibonacci {
        public static int of(int n) {
            if (n <= 0)
                return -1;
            else if (n == 1 || n == 2)
                return 1;
            else
                return of(n - 1) + of(n - 2);
        }
    }
}
