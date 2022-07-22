package javatut.lambda;

public class Factorial {
    private static int factorial(int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }

    private interface IAcc{
        int acc(int n, int acc);
    }

    private static int factorial_2(int n) {
        IAcc acc = (int n, int acc) -> {
            return (n == 1) ? acc : factorial_2(n - 1);
        };
        return acc.acc(n, 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
