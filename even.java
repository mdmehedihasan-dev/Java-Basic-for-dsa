public class even {

    public static boolean isEven(int N){
        if(N%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String args[]){
        boolean result = isEven(16);
        System.out.println(result);
    }
    
}
