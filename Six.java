import java.util.Arrays;

public class Six {

    // Find Maximum Number.
    static int maxNumber(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Find Minimum Number.
    static int minNumber(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 11, 32, 7, 5, 3, 9, 4 };
        System.out.println("Original Array is >> " + Arrays.toString(arr)); //used Arrays.toString() function for print the array.
       
        // Print the values from the array using for loop.
        // System.out.print("Original Array is >> ");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        maxNumber(arr);
        minNumber(arr);

        int max = maxNumber(arr);
        System.out.println("Maximum Number >> " + max);
        int min = minNumber(arr);
        System.out.println("Manimum Number >> " + min);

    }
}
