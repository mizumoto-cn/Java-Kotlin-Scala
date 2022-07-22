package javatut.lambda;

import java.util.Scanner;

public class Comparison {
    public interface IComparator<T> {
        public String compare(T a, T b);
    }

    public static void Compare(int x, int y){
        IComparator<Integer> icmp = (a, b) -> {
            return (a>b) ? "xはyより大きい" : "";
        };
        System.out.println(icmp.compare(x, y));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
        Compare(x, y);
        scan.close();
    }
}
