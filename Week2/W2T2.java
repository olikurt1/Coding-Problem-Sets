package Week2;

public class W2T2 {
    public static void main(String[] args){
        boolean weekday = true;
        int time = 11;
        if(weekday == true){
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
        else{
            if(time <= 17){
                System.out.println("You can rest now");
            }
            else{
                System.out.println("Time for bed.");
            }
        }
    }
}
