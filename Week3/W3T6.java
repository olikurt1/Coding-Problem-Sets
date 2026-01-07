package Week3;

public class W3T6 {
    public static void main(String[] args){
        for(int x = 1; x <= 6; x++){
            System.out.println("The current row is "+x);
            for(int y = 1; y < x; y++){
                System.out.println("The current number is "+y);
                System.out.print(y+ " ");
            }
            System.out.println();
        }
    }
}
