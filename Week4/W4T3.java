package Week4;

public class W4T3 {
    static String checkEvenOdd(int num){
        if(num %2 == 0){
            return("Even");
        }
        else{
            return("Odd");
        }
    }
    public static void main(String[] args){
        assert checkEvenOdd(10).equals("Even");
        assert checkEvenOdd(1).equals("Odd");
        System.out.println("All tests passed");
    }
}
