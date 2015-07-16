package LinkedList;

public class LinkedList<T> {

    private ListItem<T> firstElement;
    private int size;

    LinkedList() {
        this.firstElement = null;
        this.size = 0;
    }

    public void add(T value) {
        ListItem<T> item = new ListItem<T>(value);
        if (this.firstElement == null) {
            this.firstElement = item;
        } else {
            ListItem<T> head = this.firstElement;
            while (head.getNextItem() != null) {
                head = head.getNextItem();
            }
            head.setNextItem(item);
        }
        this.size++;
    }

    public ListItem<T> get(int index) {

        if (index >= this.size) {
            throw new NullPointerException();
        } else {
            int currentIndex = 0;
            ListItem<T> head = this.firstElement;
            while (currentIndex < index) {
                currentIndex++;
                head = head.getNextItem();
            }
            return head;
        }
    }

    public void remove(int index) {
        ListItem<T> head = this.firstElement;
        int currentIndex = 0;
        if (index >= this.size) {
            throw new NullPointerException();
        }
        while (currentIndex < index - 1) {
            currentIndex++;
            head = head.getNextItem();
        }
        if (head.getNextItem().getNextItem() == null) {
            head.setNextItem(null);
            this.size--;
        } else {
            head.setNextItem(head.getNextItem().getNextItem());
            this.size--;
        }
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        this.firstElement = null;
        this.size = 0;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(this.get(i) + ",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
