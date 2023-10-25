public class DayNineteen {
    // Function that copy one array into another array.
    static void copyArrayElements(int firstArray[], int secondArray[]) {
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

    }

    public static void main(String[] args) {

        // Original array
        int firstArray[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // Print original array
        System.out.print("Elements of original array : ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }

        // copied array
        int secondArray[] = new int[firstArray.length];

        // call the copyArrayElements() function
        copyArrayElements(firstArray, secondArray);
        System.out.println();
        System.out.print("Elements of copied array : ");

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }

}
