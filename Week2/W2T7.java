package Week2;
import java.util.Scanner;
public class W2T7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose (r)ock, (p)aper, (s)cissors");
        int weapon = input.nextLine().charAt(0);
        System.out.println(weapon == 'r'? "You chose rock.":weapon == 'p'?"You chose paper":weapon == 's'? "you chose scissors":"Cheater");

    }
}
