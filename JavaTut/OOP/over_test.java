package javatut.oop;

public class over_test {
    public static void main(String[] args) {
        // Rewrite
        System.out.println("Default static func add(1,2) = " + javatut.oop.method.Method.add(1, 2));
        System.out.println("Rewrite for static func add(1,2) = " + javatut.oop.override.MethodOverride.add(1, 2));
        javatut.oop.method.Method override = new javatut.oop.override.MethodOverride();
        javatut.oop.method.Method raw = new javatut.oop.method.Method();
        System.out.println("Default non-static func add(1,2) = " + raw.non_static_add(1, 2));
        System.out.println("Override for non-static func add(1,2) = " + override.non_static_add(1, 2));
        // You cannot
        //System.out.println("New non-static func add(1,2,3) = " + override.non_static_add(1, 2, 3));
        //
        // You can
        var real_override = new javatut.oop.override.MethodOverride();
        System.out.println("New non-static func add(1,2,3) = " + real_override.non_static_add(1, 2, 3));

        // overload
        var overload = new javatut.oop.overload.MethodOverload(1,2);
        System.out.println("Overload add(1,2) = " + overload.add_overload(1, 2, 3));
        System.out.println("Overload add(1,2,3) = " + overload.add_overload());
    }
}
