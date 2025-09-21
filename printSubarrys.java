// "static void main" must be defined in a public class.
public class Main {
    
    public static void printSubarrys(int numbers[]){
       int totalSubarrays = 0;
        for(int i=0; i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for (int k=start; k<=end; k++){
                    System.out.print(numbers[k]+ "");
                }
                 
                System.out.println();
                totalSubarrays++; 
            }
            System.out.println();
        }
         System.out.println("Total Subarrays: " + totalSubarrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,6,7,8,9};
        printSubarrys(numbers);
    }
}
