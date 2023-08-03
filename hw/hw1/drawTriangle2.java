public class drawTriangle2 {
    public int N;
    public drawTriangle2(int size) {
        N = size;
    }
    public void drawTriangle() {
        int col = 1;
        int row = 1;
        int SIZE = N;

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
    public static void main(String[] args) {
        /* construct an instance */
        drawTriangle2 myTriangle = new drawTriangle2(3);
        /* call the drawTriangle method */
        myTriangle.drawTriangle();
        /* there should be some simpler approaches */
    }
}
