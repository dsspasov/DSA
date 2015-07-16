import java.util.Stack;

public class ShortestSequence {

    private static Stack<Integer> findShortestPath(int n, int m) throws IllegalArgumentException {
        if (n >= m) {
            throw new IllegalArgumentException();
        } else {
            Stack<Integer> operations = new Stack<Integer>();
            operations.push(m);
            if (m % 2 != 0) {
                m = m - 1;
                operations.push(m);
            }
            while (m / 2 >= n) {
                m = m / 2;
                operations.push(m);
            }
            while (m - 2 >= n) {
                m = m - 2;
                operations.push(m);
            }
            while (m - 1 >= n) {
                m = m - 1;
                operations.push(m);
            }
            return operations;
        }

    }

    public static void main(String[] args) {

        Stack<Integer> x = ShortestSequence.findShortestPath(6, 17);
        StringBuilder path = new StringBuilder();
        while (!x.isEmpty()) {
            path.append(x.pop() + "->");
        }
        path.delete(path.length() - 2, path.length());

        System.out.println(path.toString());
       
    }

}
