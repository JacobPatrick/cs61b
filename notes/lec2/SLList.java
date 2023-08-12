/** A list of intergers, which hides the terrible truth of the nakedness withiin. */
public class SLList {
    /** 
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
     */
    /** When the IntNode class never uses the details of the SLList class, take the keyword "static". */
    private IntNode sentinel; // The first item, if it exists, is at sentinel.next.
    private int size;

    /** Create an empty list. */
    public SLList() {
        sentinel = new IntNode(6, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(6, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Return the first item of the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        size += 1;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Return the size of the list start from the IntNode p.(the private methods that speaks the language of god) */
    // private static int size(IntNode p) {
    //     if (p.next == null) {
    //         return 1;
    //     }
    //     return 1 + size(p.next);
    // }
    
    /** Return the size of the list.(the public methods that speaks the language of the mortals) */
    public int size() {
        return size;
        // return size(first);
    }


    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(6);
        L.addFirst(3);
        L.addLast(12);
        System.out.println(L.getFirst());
    }
}
