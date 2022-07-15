public class UnbelievableDisgustingTypecasting {
    public static void main(String[] args) {
        var longnum = 10L;
        var floatnum = 10.0f;
        var doublenum = 10.0d;
        Double sum = longnum + floatnum + doublenum;
        System.out.println(sum);
        System.out.println(sum == 30.0d);
        System.out.println(sum == 30.0f);
        System.out.println(sum == 30L);
        sum += 0.1f;
        System.out.println(30.1f == sum);
        System.out.println(sum.equals(30.1f));
        System.out.println(sum.compareTo(30.1d) == 0);
        sum -= 0.1f - 0.1d;
        System.out.println(sum.compareTo(30.1d) == 0);
    }

}
