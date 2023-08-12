public class RotatingSLList<Item> extends SLList<Item> {
    // Note that the constructors of the classes are not inheritated.
    // Use super(); method to make a call to the superclass's no-argument constructor.
    public void rotatingRight() {
        Item data = removeLast();
        addFirst(data);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rsl = new RotatingSLList<>();
        /* Creates LList: [10, 11, 12, 13] */
        rsl.addLast(10);
        rsl.addLast(11);
        rsl.addLast(12);
        rsl.addLast(13);

        /* The output should be [13, 10 ,11, 12] */
        rsl.rotatingRight();
        rsl.print();
    }
}
