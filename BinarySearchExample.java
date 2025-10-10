public class BinarySearchExample {
    // Binary Search করার method, sorted array এবং target number নেয়
    public static int binarySearch(int arr[], int target){
        int low = 0;               // search করার জন্য প্রথম index
        int high = arr.length - 1; // search করার জন্য শেষ index

        // যতক্ষণ পর্যন্ত low <= high, ততক্ষণ search চলবে
        while (low <= high){
            int mid = (low + high) / 2;  // মাঝখান বের করা

            if(arr[mid] == target){
                return mid;              // target found, index return করবে
            } else if(arr[mid] < target){
                low = mid + 1;           // target ডান দিকে, তাই low update
            } else{
                high = mid - 1;          // target বাম দিকে, তাই high update
            }
        } 
            
        return -1; // যদি target পাওয়া না যায়, -1 return করবে
    }

    public static void main(String args[]){
        int numbers[] = {0,1,2,3,4,5,5,6,7,8,9}; // sorted array
        int target = 5;                            // যেটা search করতে চাই

        int result1 = binarySearch(numbers, target); // binary search call

        // search result check
        if(result1 != -1){
            System.out.println(target + " Found on index " + result1);
            // target পাওয়া গেছে → index প্রিন্ট করবে
        } else{
            System.out.println(target + " Not Found index");
            // target পাওয়া যায়নি → message print করবে
        }
    }
}
