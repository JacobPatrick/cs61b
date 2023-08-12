public class HoFDemo {
    public static int do_twice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        int x = 2;
        IntUnaryFunction tenx = new TenX();
        System.out.println(do_twice(tenx, x));
    }
}
