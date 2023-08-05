/** While SLList stands for "singly linked list", DLList stands for "doubly linked list". */
public class DLList {
    private DLIntNode sentinel;
    private DLIntNode first;
    private DLIntNode last;
    private int size;

    public DLList() {
        size = 0;
        sentinel = new DLIntNode(null, 6, null);
    }

    public DLList(int x) {
        size = 1;
        sentinel = new DLIntNode(first, 6, first);
        first = new DLIntNode(sentinel, x, sentinel);
        last = first;
    }

    public int size() {
        return size;
    }

    public void addFirst(int x) {
        size += 1;
        first = new DLIntNode(sentinel, x, sentinel.next);
        sentinel.next = first;
        first.next.prev = first;
    }

    /** Note that if there only exists 1 element in the list,
     * this mothods will come up with something we are unwilling to see. */
    public void removeFirst() {
        size -= 1;
        first = first.next;
        first.prev = sentinel;
        sentinel.next = first;
    }

    public int getFirst() {
        return first.item;
    }

    public int getLast() {
        return last.item;
    }

    public void addLast(int x) {
        size += 1;
        last = new DLIntNode(sentinel.prev, x, sentinel);
        sentinel.prev = last;
        last.prev.next = last;
    }

    /** Note that if there only exists 1 element in the list,
     * this mothods will come up with something we are unwilling to see. */
    public void removeLast() {
        size -= 1;
        last = last.prev;
        last.next = sentinel;
        sentinel.prev = last;
    }

    public static void main(String[] args) {
        DLList L = new DLList(5);
        // L.addFirst(6);
        // L.addLast(9);
        // L.removeLast();
        // System.out.println(L.first.item);
        // System.out.println(L.last.item);
        System.out.println(L.first.next);
    }
}
