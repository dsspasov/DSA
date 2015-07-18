package Stack;

import java.util.Arrays;

public class Stack<T> {
    private int head;
    private Object [] array;
    private static final int CAPACITY = 2;
    Stack(){
        this.array = new Object[CAPACITY];
        this.head = 0;
    }
    
    Stack(int capacity){
        
        if(capacity>CAPACITY){
            this.array = new Object[capacity];
        }else{
            this.array = new Object[CAPACITY];            
        }
        this.head = 0;
    }

    public void push(T value){
        this.expandStack();
        this.array[this.head++] = value;
    }
    
    @SuppressWarnings("unchecked")
    public T pop(){
        this.head = this.head-1;
        T value = (T) this.array[this.head];
        this.array[this.head] = null;
        return value;
    }
    
    @SuppressWarnings("unchecked")
    public T peek(){
        return (T)this.array[this.head-1];
    }
    
    public void trim(){
        this.array = Arrays.copyOf(this.array, this.head);
    }
    
    public int size(){
        return this.head;
    }
    
    public void clear(){
        this.array = null;
        this.head = 0;
    }

    private void expandStack(){
        if(this.head +1 > this.array.length){
            int newSize = 2 * this.array.length;
            this.array = Arrays.copyOf(this.array, newSize);
        }
    }
    
    

}
