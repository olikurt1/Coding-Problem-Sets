package Week4;

public class W4T4 {
    static String reverseString(String str){
        String revedString = "";
        for(int x = str.length()-1; x > -1; x--){
            revedString = revedString + str.charAt(x);
        }
        return revedString;
    }
    public static void main(String[] args){
        assert reverseString("Java").equals("avaJ");
        assert reverseString("Hello, World").equals("dlroW ,olleH");
        System.out.println("All tests passed");
    }
}
