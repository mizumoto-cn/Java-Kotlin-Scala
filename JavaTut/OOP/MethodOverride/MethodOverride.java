package JavaTut.OOP.MethodOverride;

import JavaTut.OOP.Method.Method;

public class MethodOverride extends Method {

    //声明为 static 的方法不能被重写，但是能够被再次声明。
    public static int add(int a, int b) {
        return - a - 2 * b;
    }

    public int non_static_add(int a, int b) {
        return - a - 2 * b;
    }

    public int non_static_add(int a, int b, int c) {
        return - a - 2 * b - 3 * c;
    }
}
