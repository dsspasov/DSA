import java.util.LinkedList;
import java.util.List;


public class FindSumAndAverage {

    private List<Integer> list = null;
    private int sum = 0;
    private double average = 0;
    
    FindSumAndAverage(){
        this.setList(new LinkedList<Integer>());
        this.setAverage(0);
        this.setSum(0);
    }
      
    public List<Integer> getList() {
        return list;
    }
   
    public void setList(List<Integer> list) {
        this.list = list;
    }
    
   
    public void calculate(){
        for(int element = 1; element<10; element++){
         
            this.list.add(element);
            this.sum += element;
        }

        this.average = this.sum/this.list.size();
    }
    
    public static void main(String[] args) {
        FindSumAndAverage listOfElements = new FindSumAndAverage();
        listOfElements.calculate();
        System.out.println("Sum: "+listOfElements.getSum()+", Average: " + listOfElements.getAverage());
        
    }


    public int getSum() {
        return sum;
    }


    public void setSum(int sum) {
        this.sum = sum;
    }


    public double getAverage() {
        return average;
    }


    public void setAverage(double average) {
        this.average = average;
    }

    
}
