public class maxValue {
    public static int[] m;
    public maxValue(int[] numbers) {
        m = numbers;
    }
    /** Returns the maximum value from m. */
    public int max(int[] m) {
        int maximum = m[0];
        for (int i = 1; i < m.length; i = i + 1) {
            if (maximum < m[i]) {
                maximum = m[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        maxValue myMaxValue = new maxValue(numbers);
        System.out.println(myMaxValue.max(m));
    }
}
