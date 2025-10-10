public class PalindromeNumber {

    public static boolean isPalindromeNumber(int N) {
        int temp = N;
        int rev = 0;

        while (N > 0) {
            int digit = N % 10;
            rev = rev * 10 + digit;
            N = N / 10; // fix here
        }

        return temp == rev; // simplified
    }

    public static void main(String args[]) {
        boolean result1 = isPalindromeNumber(125);
        System.out.println("125: " + result1);

        boolean result2 = isPalindromeNumber(12321);
        System.out.println("12321: " + result2);
    }
}
