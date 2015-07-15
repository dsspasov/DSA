import java.util.Stack;


public class ReverseSequenceOfNumbers {
    public static void main(String[] args) {
        Stack<Integer> stackOfNumbers = new Stack<Integer>();
        for(int i = 5; i<15; i++){
            stackOfNumbers.push(i);
        }
        while(!stackOfNumbers.empty()){
            System.out.println(stackOfNumbers.pop());
        }
    }

}
