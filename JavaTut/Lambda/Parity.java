package javatut.lambda;

import java.util.Scanner;

public class Parity {
    private static Boolean parity(int n) {
        return (n % 2 == 0) ? false : true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.out.println(parity(n)?"odd":"even");
        scan.close();
    }
}
