package Week2;
import java.util.Random;
import java.util.Scanner;
public class W2T3 {
    public static void main(String[] args){
        Random r = new Random();
        int firstNum = r.nextInt(13);
        int secondNum = r.nextInt(13);

        int correctanswer = firstNum * secondNum;

        Scanner input = new Scanner(System.in);
        System.out.println("What is "+firstNum+ " * "+secondNum);
        int kidAnswer = input.nextInt();
        if(kidAnswer == correctanswer){
            System.out.println("The answer is correct.");
        }
        else if(kidAnswer != correctanswer){
            System.out.println("This is wrong. The correct answer is "+correctanswer);
        }
    }
}
