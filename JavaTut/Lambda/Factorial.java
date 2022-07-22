package javatut.lambda;

public class Factorial {
    private static int factorial(int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }

    private static int factorial_acc(int n, int acc) {
        return (n < 1) ? acc : factorial_acc(n - 1, acc * n);
    }

    private static int factorial_2(int n) {
        return factorial_acc(n, 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial_2(10));
    }
}
