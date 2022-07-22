package javatut.hello;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        System.out.println(n > 80 ? "優" : n > 70 ? "良" : n > 60 ? "可" : "不可");
        scan.close();
    }
}
