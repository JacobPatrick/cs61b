/** Rebranding the IntList class. */
public class IntNode {
    public IntNode prev;
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}
