public class BinaryToDecimal {


    public static int binaryDecmal(int N){
        int multi = 1;
        int sum = 0;
        while(N>0){
            int digit = N % 10;
            sum =  sum + digit*multi;
            N = N/10;
            multi = multi*2;
        }
        return sum;

    }

    public static void main (String args[]){
       int result1 = binaryDecmal(111);
       System.out.println(result1);

    }
}