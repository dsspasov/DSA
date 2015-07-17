package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(6);
        list.add(8);
        
        //System.out.println(list.getSize());
        //System.out.println(list.get(1).toString());
        //list.remove(1);
        list.clear();
        System.out.println(list.toString());
    }

}
