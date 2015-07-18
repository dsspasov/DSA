package Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        
        st.push(9);
        st.push(8);
        
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        
        st.trim();
        st.push(7);
        System.out.println(st.peek());
        System.out.println(st.size());
        
        st.push(6);
    }

}
