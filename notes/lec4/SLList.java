public class SLList<T> implements List61b<T>{
    private Node<T> sentinel;
    private int size;

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T i, Node<T> n) {
            this.item = i;
            this.next = n;
        }
    }

    public SLList() {
        sentinel = new Node<>(null, null);
    }

    public SLList(T data) {
        sentinel = new Node<>(data, null);
        sentinel.next = new Node<>(data, null);
        size = 1;
    }

    public void addFirst(T data) {
        sentinel.next = new Node<>(data, sentinel.next);
        size += 1;
    }

    public T getFirst() {
        return sentinel.next.item;
    }

    public void addLast(T data) {
        size += 1;
        
        if (sentinel.next == null) {
            sentinel.next = new Node<>(data, null);
        } else {
            Node<T> p = sentinel;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new Node<>(data, null);
        }
    }

    public T getLast() {
        Node<T> p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public T removeLast() {
        Node<T> p = sentinel;
        while (p.next.next != null) {
            p = p.next;
        }
        T i = p.next.item;
        p.next = null;
        return i;
    }

    public T get(int i) {
        Node<T> p = sentinel;
        for (int j = 0; j < i; j += 1) {
            p = p.next;
        }
        return p.item;
    }

    public void insert(T data, int pos) {
        if (sentinel.next == null || pos == 0) {
            addFirst(data);
            return;
        }
        
        Node<T> currentNode = sentinel.next.next;
        while (pos > 1 && currentNode.next != null) {
            pos += 1;
            currentNode = currentNode.next;
        }

        Node<T> newNode = new Node<>(data, currentNode.next);
        currentNode.next = newNode;
    }

    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (Node<T> p = sentinel.next; p != null; p = p.next) {
            System.out.print(p.item + " ");
        }

        System.out.println();
    }
}
