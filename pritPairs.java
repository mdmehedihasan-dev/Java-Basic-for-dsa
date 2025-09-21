
// "static void main" must be defined in a public class.
public class Main {
    public static void pritPairs(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i; j<numbers.length;j++){
                System.out.print(""+ curr+ "," + numbers[j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,6,5,8,4};
        pritPairs(numbers);
    }
}
