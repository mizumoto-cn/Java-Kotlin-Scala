package JavaTut.OOP.Method;

public class Method {
    // public static void main(String[] args) {
    //     System.out.println(add(1, 2));
    // }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int cmp(int a, int b) {
        if(a == b) {
            return 0;
        } else if(a > b) {
            return 1;
        } else {
            return -1;
        }
    }

    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public int non_static_add(int a, int b) {
        return a + b;
    }
}