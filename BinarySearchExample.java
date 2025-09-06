public class BinarySearchExample {
    public static int binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low+ high )/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        } 
            
        return -1;


    }




    public static void main(String args[]){
        int numbers[] = {0,1,2,3,4,5,5,6,7,8,9};
        int target = 5;

        int result1 = binarySearch(numbers, target);

        if(result1 != -1){
            System.out.println(target + " Found on index " + result1);;
        }else{
            System.out.println(target + " Not Found");
        }


    }

}
