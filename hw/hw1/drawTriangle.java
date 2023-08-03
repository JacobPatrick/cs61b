public class drawTriangle {
    public static void main (String[] args) {
        int col = 1;
        int row = 1;
        int SIZE = 5;

        while (row <= SIZE) {
            while (col <= row) {
                System.out.print('*');
                col = col + 1;
            }
            row = row + 1;
            col = 1;
            System.out.println();
        }
    }
}
