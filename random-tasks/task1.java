/*Calculator */
import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second Number: ");
        int secondNum = input.nextInt();

        System.out.println("The sum of your numbers is: "+ (firstNum+secondNum));
    }
}
