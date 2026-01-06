public class W1T4 {
    public static void main(String[] args){
        String x = "Goodbye";
        String y = "Hello";
        String temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}
