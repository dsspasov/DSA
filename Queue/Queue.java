package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> {

    private int size;
    private static final int DEFAULT_CAPACITY = 1000;
    private List<T> elements;

    Queue() {
        this(DEFAULT_CAPACITY);
    }

    Queue(int capacity) {
        super();
        this.size = capacity;
        this.elements = new LinkedList<T>();
    }

    public int length() {
        return this.elements.size();
    }

    public void clear() {
        this.size = 0;
        this.elements = null;
    }

    public boolean add(T value) throws NullPointerException {
        if(this.size>this.length()){
            this.elements.add(this.length(), value);
            return true;
        }else{
            throw new NullPointerException();
        }
    }

    public boolean offer(T value) {
        if(this.size>this.length()){
            this.elements.add(this.length(), value);
            return true;
        } else {
            return false;
        }
        
    }

    public T remove() {
        if (!this.elements.isEmpty()) {
            T value = this.elements.remove(0);
            return value;
        } else {
            throw new NoSuchElementException();
        }
    }

    public T poll() {
        if (!this.elements.isEmpty()) {
            T value = this.elements.remove(0);
            return value;
        } else {
            return null;
        }
    }

    public T element() {
        if (!this.elements.isEmpty()) {
            T value = this.elements.get(0);
            return value;
        } else {
            throw new NoSuchElementException();
        }
    }

    public T peek() {
        if (!this.elements.isEmpty()) {
            T value = this.elements.get(0);
            return value;
        } else {
            return null;
        }
    }
}
