public class DayTwentyNine {
    // Function to print number triangle pattern
    public static void printPattern(int n) {
       
        // outer loop to handle number of rows
        for (int i = 1; i <= n; i++) {
            // inner loop to print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 7;
        // Function call
        printPattern(n);

    }
}
