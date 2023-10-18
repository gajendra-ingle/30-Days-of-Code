import java.util.Scanner;

public class Twelve {

    // Function that print the fibonacci series.
    static void printFibonacciSeries(int number) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= number; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Call printFibonacciSeries() function
        printFibonacciSeries(number);

        sc.close();
    }
}
