// public class MinMaxExample {
//     public static void main(String[] args) {
//         // একটা integer array যেখানে positive আর negative সংখ্যা আছে
//         int[] numbers = {15, -8, 22, 0, -18, 9};

//         // Largest বের করার জন্য প্রথমে সবচেয়ে ছোট possible value ধরি
//         int largest = Integer.MIN_VALUE;   // -2147483648

//         // Smallest বের করার জন্য প্রথমে সবচেয়ে বড় possible value ধরি
//         int smallest = Integer.MAX_VALUE;  // 2147483647

//         // এখন array-এর প্রতিটি number একে একে loop এর মাধ্যমে ঘুরব
//         for (int num : numbers) {
//             // যদি বর্তমান সংখ্যা largest এর চেয়ে বড় হয় → largest আপডেট করব
//             if (num > largest) {
//                 largest = num;
//             }
//             // যদি বর্তমান সংখ্যা smallest এর চেয়ে ছোট হয় → smallest আপডেট করব
//             if (num < smallest) {
//                 smallest = num;
//             }
//         }

//         // লুপ শেষে largest আর smallest পাওয়া যাবে
//         System.out.println("Largest: " + largest);   // সবচেয়ে বড় সংখ্যা প্রিন্ট করবে
//         System.out.println("Smallest: " + smallest); // সবচেয়ে ছোট সংখ্যা প্রিন্ট করবে
//     }
// }

public class MinMaxExample{
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,2,55,22,44,11,99,12,41,35,0,-2};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Largest Number is " + largest);
        System.out.println("Smallest Number is " + smallest);
    }
}