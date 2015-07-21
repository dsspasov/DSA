package LinkedList;

public class ListItem<T> {

    private T value;
    private ListItem<T> nextItem;
    ListItem(T value){
        this.setValue(value);
        this.setNextItem(null);
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public ListItem<T> getNextItem() {
        return nextItem;
    }
    public void setNextItem(ListItem<T> nextItem) {
        this.nextItem = nextItem;
    }
    public String toString(){
        return String.valueOf(this.value);        
    }
    
}
