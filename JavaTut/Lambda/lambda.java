package JavaTut.Lambda;

public class lambda {
    
    public interface ILambda {
        public int run();
    }

    public static void main(String[] args) {
        ILambda func_5 = () -> 5;
        System.out.println(func_5.run());
    }
}
