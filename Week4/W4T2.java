package Week4;

public class W4T2 {
    static String concat(String a, String b){
        return(a + b);
    }
    public static void main(String[] args){
        assert concat("Hello", "World").equals("HelloWorld");
        assert concat("Imperative", "Programming").equals("ImperativeProgramming");
        System.out.println("All tests passed");
    }
}
