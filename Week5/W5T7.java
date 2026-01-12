package Week5;
import java.util.Arrays;
public class W5T7 {
    public static void main(String[] args){
        int lessThanIndex = 0;
        int GreaterThanIndex = 0;
        int[] numbers = {9, 12, 3, 5, 14, 10, 10, 15};
        int[] lessThan = new int[numbers.length];
        int[] greaterThanOrEqual = new int[numbers.length];
        int pivot  = 10;
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x]< pivot){
                lessThan[lessThanIndex] = numbers[x];
                lessThanIndex ++;

            }
            else if(numbers[x]>= pivot){
                greaterThanOrEqual[GreaterThanIndex] = numbers[x];
                GreaterThanIndex ++;
            }
        }
        String StringedLess = Arrays.toString(lessThan);
        String StringedGreaterEqual = Arrays.toString(greaterThanOrEqual);

        System.out.println("Is less than: "+StringedLess);
        System.out.println("Is greater than or equal to: "+StringedGreaterEqual);
    }
}
