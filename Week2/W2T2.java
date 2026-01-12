package Week2;
import java.util.Scanner;
public class W2T2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Is it a weekday? (y/n)");
        String weekday = input.nextLine();
        
        System.out.println("What is the time?");
        int time = input.nextInt();
        if(time >24){
            System.out.println("This time does not exist");
        }

        if(weekday == "y"){
            if(time < 12){
                System.out.println("Go to your lecture.");
            }
            else if(time >=12 && time <=17){
                System.out.println("Go to the lab");
            }
            else{
                System.out.println("Time for bed");
            }
        }
        else if(weekday == "n"){
            if(time <= 17){
                System.out.println("You can rest now");
            }
            else{
                System.out.println("Time for bed.");
            }
        }
        else{
            System.out.println("Incorrect selection");
        }
    }
}
