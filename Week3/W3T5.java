
import java.util.Scanner;
public class W3T5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the start range of the loop");
        int start = input.nextInt();
        
        System.out.println("What is the end range of the loops");
        int end = input.nextInt();

        for(int x = start; x < end; x++){
            if(x%2 == 0){
                System.out.println(x);
            }
        }
    }
}
