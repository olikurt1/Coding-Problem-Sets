package Week5;
import java.util.Arrays;
public class W5T6 {
    public static void main(String[] args){
        int[] numbers = {9, 12, 3, 5, 14, 10, 10, 15};
        int[] reversednumbers = new int [numbers.length];

        for(int x = numbers.length-1, y= 0; x >= 0;x--, y++){
            reversednumbers[y] = numbers[x];
            
        }
        String reversednumber = Arrays.toString(reversednumbers);
        System.out.println("Reversed: "+reversednumber);
    }
}
