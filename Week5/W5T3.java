package Week5;

public class W5T3 {
    public static void main(String[] args){
        int sum = 0;
        int[] numbers = {9, 12, 3, 5, 14, 10, 10, 15};
        for(int x = 0; x < numbers.length; x++){
            sum += numbers[x];        
        }
        float average = sum/ numbers.length;
        System.out.print(average);  
    }
        
}
