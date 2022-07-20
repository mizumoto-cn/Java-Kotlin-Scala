package javatut.oop.overload;


public class MethodOverload{
    public int a;

    public int b;

    public MethodOverload(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add_overload(int a, int b, int c) {
        return a + 2 * b + 3 * c;
    }

    public int add_overload() {
        return this.a + 2 * this.b;
    }
}
