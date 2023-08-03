public class posSum {
    public static int[] a;
    public static int n;

    public posSum(int[] array, int number) {
        a = array;
        n = number;
    }

    /** Return an array, of which each positive element a[i] 
     * be replaced with the sum of a[i] through a[i+n] */
    public void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i += 1) {
            if (a[i] < 0) {
                continue;
            }
            for (int j = i + 1; j <= i + n; j += 1) {
                if (j == a.length) {
                    break;
                }
                a[i] = a[i] + a[j];
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 5, 4};
        int number = 3;
        posSum myPosSum = new posSum(array, number);

        myPosSum.windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
