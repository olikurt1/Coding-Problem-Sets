

package Week2;
import java.util.Scanner;
import java.lang.Math.*;

public class W2T1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle in cm?");
        double userRadius = input.nextDouble(); 
        if(userRadius < 0){
            System.out.println("The radius cannot be negative");
        }
        else{
            double area = userRadius * userRadius * Math.PI;
            System.out.format("The area of the circle is %.2f cm^2. ", area);
        }
        
        

    }
}
