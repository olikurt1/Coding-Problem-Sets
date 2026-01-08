package Week5;

public class W5T1 {
    public static void main(String[]args){
        int[] arrNum = {10, 100, 1000, 10000};
        String[] arrStr = {"Oliver", "Kurta"};

        for(int x = 0;  x < arrNum.length; x++){
            /*Have to specify to grab from that array at the index worth x  */
            System.out.println(arrNum[x]);
        }

        for(int x= 0; x <arrStr.length; x++){
            System.out.println(arrStr[x]);
        }
    }
}
