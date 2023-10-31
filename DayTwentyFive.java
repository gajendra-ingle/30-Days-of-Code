import java.util.Scanner;

public class DayTwentyFive {
    // Function that find missing number
    static int findMissingNumber(int arr[], int len) {

        int total = ((len + 1) * (len + 2) / 2);
        for (int i = 0; i < len; i++) {
            total = total - arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 5, 6 };

        int len = arr.length;

        // Print the original array
        System.out.print("Original array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Function call
        System.out.println();
        System.out.print("The missing number in an array is : " + findMissingNumber(arr, len));

        // sc close
        sc.close();
    }
}
