public class ReverseArray {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Original Array print করা
        System.out.print("Original Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // newline

        // Array reverse করা
        reverse(numbers);

        // Reversed Array print করা
        System.out.print("Reversed Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // newline
    }
}
