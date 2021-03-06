import java.util.HashMap;
import java.util.Map;

public class MajorantOfArray {

    private static int countOccurrences(int[] array)  {

        int length = array.length;
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            if (!numbers.containsKey(array[i])) {
                numbers.put(array[i], 1);
            } else {
                int currentNumberOfOccur = numbers.get(array[i])+1;
                if(currentNumberOfOccur>= length/2 + 1){
                    return array[i];
                }
                numbers.put(array[i], currentNumberOfOccur);
            }

        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int[] array = new int[] { 2, 2, 3, 3, 2, 3, 4, 3, 3 };

        System.out.println(MajorantOfArray.countOccurrences(array));

    }
}
