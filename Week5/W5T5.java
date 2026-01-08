package Week5;

public class W5T5 {
    public static void main(String[] args){
        int[] numbers = {9, 12, 3, 5, 14, 10, 10, 15};
        int max = numbers[0];
        for(int x = 0; x < numbers.length;x++){
            if(numbers[x ]> max){
                max = numbers[x];
            }
        }
        System.out.println("Max: "+max); 
    }
}
