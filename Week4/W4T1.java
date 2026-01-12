package Week4;
public class W4T1{
    static int square(int a){
        return a*a;
    }
    public static void main(String[] args){
        assert square(3) == 9;
        assert square(4) == 16;
        assert square(5)== 25;

        System.out.println("all tests passed");
    }
}