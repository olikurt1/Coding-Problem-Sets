package Week5;

public class W5T4 {
    public static void main(String[] args){
        String[] strs = {"Imperative", "Programming", "is", "nice", "!"};
        for(int x = 0; x < strs.length-2; x++){
            System.out.print(strs[x]+" ");
        }
        System.out.print(strs[3]+strs[4]);
    }
}
