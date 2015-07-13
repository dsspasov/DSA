import java.util.LinkedList;
import java.util.List;

public class FindLongestSequence {

    private static List<Integer> findLongestSubsequenceOfEquals(List<Integer> listOfElements) {
        int bestLength = 1;
        int currentLength = 1;
        int bestElement = listOfElements.get(0);
        // int currentElement = listOfElements.get(0);

        int length = listOfElements.size();

        for (int index = 1; index < length; index++) {
            int currentElement = listOfElements.get(index);

            if (currentElement == listOfElements.get(index - 1)) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestElement = currentElement;
                }
            } else {
                currentLength = 1;
            }

        }

        List<Integer> elements = new LinkedList<Integer>();
        for(int i = 0; i<bestLength; i++){
            elements.add(bestElement);
        }
        return elements;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        numbers.add(2);
        numbers.add(2);

        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);

        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        

        numbers.add(6);

        System.out.println(FindLongestSequence.findLongestSubsequenceOfEquals(numbers).toString());

    }
}
