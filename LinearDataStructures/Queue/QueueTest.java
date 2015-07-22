package Queue;

public class QueueTest {

    public static void main(String[] args) {
        
        Queue<Integer> qe = new Queue<Integer>(3);
        qe.offer(1);
        qe.offer(2);
        qe.offer(3);
        
        System.out.println(qe.length());
        System.out.println(qe.poll());
        System.out.println(qe.poll());
        System.out.println(qe.poll());

        
    }
}
