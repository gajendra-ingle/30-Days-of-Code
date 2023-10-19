import java.util.Scanner;

public class Thirteen {

    // function that search an eleement in an array
    static int searchElement(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 6, 3, 7, 8, 5, 9 };

        System.out.print("Enter the element you want to find : ");
        int number = sc.nextInt();

        // call the searchElement() function
        int elementFound = searchElement(arr, number);

        if (elementFound != -1) {
            System.out.println("Element found at locationa : " + elementFound);
        } else {
            System.out.println("Element not found.");
        }

        // Sc closed.
        sc.close();
    }
}
