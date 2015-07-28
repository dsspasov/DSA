import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class RemoveOddOccur {

    private static List<Number> removeOddOccurrences(List<Number> listOfNumbers){
        Map<Number,Integer> mapOfOccurrences = new HashMap<Number, Integer>();        
        for(Number number:listOfNumbers){
            if(mapOfOccurrences.containsKey(number)){
                int count = mapOfOccurrences.get(number)+1;
                mapOfOccurrences.put(number, count);
            }else{
                mapOfOccurrences.put(number, 1);
            }
        }
        
        
        for(Number key:mapOfOccurrences.keySet()){
            
            int timeOfOccurrences = mapOfOccurrences.get(key);
            if(timeOfOccurrences%2!=0){
                while(listOfNumbers.contains(key)){
                listOfNumbers.remove(key);
                }
            }
        }

        return listOfNumbers;
    }
    
    
    public static void main(String[] args) {
        List<Number> numbers = new LinkedList<Number>();
        numbers.add(4); 
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        
        System.out.println(RemoveOddOccur.removeOddOccurrences(numbers));
        
        
        //4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2
        
    }
}
