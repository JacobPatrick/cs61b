public class DLIntNode {
    public DLIntNode prev;
    public int item;
    public DLIntNode next;
    
    public DLIntNode(DLIntNode p, int i, DLIntNode n) {
        prev = p;
        item = i;
        next = n;
    }
    
}
