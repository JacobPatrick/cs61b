public interface List61b<Item> {
    public void addLast(Item data);

    public void addFirst(Item data);

    public Item removeLast();

    public Item getLast();

    public Item getFirst();

    public Item get(int i);

    public int size();

    public void insert(Item data, int pos);

    /** implemetation inheritance. */
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
