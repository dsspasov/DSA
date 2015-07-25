import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class MemebersOfSequence {

    private static List<Integer> findFirst50MemenbersOfSequence(int n){
        Queue<Integer> queueOfElements = new LinkedList<Integer>();
        List<Integer> result = new LinkedList<Integer>();
        
        queueOfElements.offer(n);
        result.add(n);
        while(!queueOfElements.isEmpty() && result.size()<50){
            int element = queueOfElements.poll();
            queueOfElements.offer(element+1);
            queueOfElements.offer(2*element+1);
            queueOfElements.offer(element+2);
            
            result.add(element+1);
            result.add(2*element+1);
            result.add(element+2);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(MemebersOfSequence.findFirst50MemenbersOfSequence(n).toString());
        
    }
    
}
