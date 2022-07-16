package JavaTut.OOP;

public class over_test {
    public static void main(String[] args) {
        // Rewrite
        System.out.println("Default static func add(1,2) = " + JavaTut.OOP.Method.Method.add(1, 2));
        System.out.println("Rewrite for static func add(1,2) = " + JavaTut.OOP.MethodOverride.MethodOverride.add(1, 2));
        JavaTut.OOP.Method.Method override = new JavaTut.OOP.MethodOverride.MethodOverride();
        JavaTut.OOP.Method.Method raw = new JavaTut.OOP.Method.Method();
        System.out.println("Default non-static func add(1,2) = " + raw.non_static_add(1, 2));
        System.out.println("Override for non-static func add(1,2) = " + override.non_static_add(1, 2));
        // You cannot
        //System.out.println("New non-static func add(1,2,3) = " + override.non_static_add(1, 2, 3));
        //
        // You can
        var real_override = new JavaTut.OOP.MethodOverride.MethodOverride();
        System.out.println("New non-static func add(1,2,3) = " + real_override.non_static_add(1, 2, 3));

        // overload
        var overload = new JavaTut.OOP.MethodOverload.MethodOverload(1,2);
        System.out.println("Overload add(1,2) = " + overload.add_overload(1, 2, 3));
        System.out.println("Overload add(1,2,3) = " + overload.add_overload());
    }
}
