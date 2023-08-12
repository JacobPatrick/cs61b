public class AList {
    private int[] items;
    private int size;

    /** Create an empty AList. */
    public AList() {
        items = new int[100]; //Just for an example.
        size = 0;
    }

    private void resize(int capacity) {
        int[] a = new int[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addLast(int x) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    public int getLast() {
        return items[size - 1];
    }

    public int removeLast() {
        int x = getLast();
        size -= 1;
        return x;
    }

    public static void main(String[] args) {
        AList L = new AList();
        for (int i = 0; i < 10; i = i + 1) {
            L.addLast(i);
        }
        System.out.println(L.getLast());
        L.removeLast();
        System.out.println(L.getLast());
        L.addLast(16);
        System.out.println(L.getLast());
        System.out.println(L.size);
    }
}
