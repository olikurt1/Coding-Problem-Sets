package Week4;

public class W4T5 {
    static int fibonacci(int n){
        if(n>1){
            return fibonacci(n-1 ) +fibonacci(n-2);
        }
        return n;
    }
    public static void main(String[] args){
        assert fibonacci(6)==8;
        System.out.println("All tests passed");
    }
}
