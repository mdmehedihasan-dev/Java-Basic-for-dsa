public class LinearSearch {
    // Linear Search Method
    public static int linearSearchExample(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // যদি ভ্যালু মিলে যায় তবে index রিটার্ন করবে
            }
        }
        return -1; // যদি না মিলে তবে -1 রিটার্ন করবে
    }

    // Main method (Corrected)
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int target1 = 20;
        // int target2 = 60;

        int result1 = linearSearchExample(numbers, target1);
        // int result2 = linearSearchExample(numbers, target2);

        if (result1 != -1) {
            System.out.println(target1 + " The number of " + result1);
        } else {
            System.out.println(target1 + " Not Found");
        }

        // if (result2 != -1) {
        //     System.out.println(target2 + " পাওয়া গেছে index: " + result2);
        // } else {
        //     System.out.println(target2 + " পাওয়া যায়নি।");
        // }
    }
}
