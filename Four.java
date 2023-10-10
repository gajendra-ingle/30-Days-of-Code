import java.util.Scanner;

public class Four {

    // method for sum of elements in an array
    public static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int arrSize = sc.nextInt();

        int arr[] = new int[arrSize];
        System.out.println("Enter the array elements : ");

        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
      
        //call the arraySum method
       int sum = arraySum(arr);
       System.out.println("Sum of array elements >> " +sum);

       sc.close();
    }
}
