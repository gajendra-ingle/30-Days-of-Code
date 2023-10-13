
public class Seven {

    // Ascending Order
    static void sortArrayAscendingOrder(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // condition is true then swap the element
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

    }

    // Descending Order
    static void sortArrayDescendingOrder(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length;j++) {
                if (arr[i] < arr[j]) {
                    // condition is true then swap the element
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 4, 1, 3, 6 };

        // Print Original Array.
        System.out.print("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Call sortArrayAscendingOrder() method
        sortArrayAscendingOrder(arr);
        System.out.println();
        System.out.print("Ascending order array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Call sortArrayDescendingOrder() method
        sortArrayDescendingOrder(arr);
        System.out.println();
        System.out.print("Descending order array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
