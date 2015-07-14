import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveNegativeNumbers {
    
    private static  List<Number> removeNegativeNumbers(List<Number> listOfNumbers){
        Iterator<Number> it = listOfNumbers.iterator();
        
        while(it.hasNext()){
            if(it.next().intValue()<0){
                it.remove();
            }
        }
        
        List<Number> resultList = new LinkedList<Number>(listOfNumbers);
        return resultList;
        //return null;
    }
    public static void main(String[] args) {
        
        List<Number> numbers = new LinkedList<Number>();
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(-1);

        numbers.add(-2);
        numbers.add(-2);

        numbers.add(3.2);
        numbers.add(3.6);
        numbers.add(3);

        numbers.add(-4);
        numbers.add(-4);
        numbers.add(-4);
        numbers.add(-4);
        numbers.add(-4);
        numbers.add(-4);

        numbers.add(5.5);
        numbers.add(56);
        numbers.add(5);
        numbers.add(5.6);
        numbers.add(5);
        numbers.add(5.3);
        

        numbers.add(6);
        
        System.out.println(RemoveNegativeNumbers.removeNegativeNumbers(numbers).toString());
        
    }

}
