import java.util.HashMap;
import java.util.Map;


public class NumberOfOccurrences {

    private static Map<Integer, Integer> countOccurrences(int[] array){
        
        int length = array.length;
        Map<Integer, Integer> numbers = new HashMap<Integer,Integer>();
        for(int i = 0; i<length; i++){
            if(!numbers.containsKey(array[i])){
                numbers.put(array[i], 1);
            }else{
                int currentNumberOfOccur = numbers.get(array[i]);
                numbers.put(array[i], currentNumberOfOccur+1);
            }
            
            
        }
        return numbers; 
    }
    
    public static void main(String[] args) {
        int [] array = new int[]{3, 4, 4, 2, 3, 3, 4, 3, 2};
        
        System.out.println(NumberOfOccurrences.countOccurrences(array).toString());
        
    }
}
