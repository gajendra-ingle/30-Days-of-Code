import java.util.Scanner;

public class Eight {

    // Calculate factorial using for loop
    static void findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial is >> " + fact);
    }

    // Calculate factorial using recursion
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        // Call the findFactorial() function.
        findFactorial(num);

        // Call factorial() function.
        int Fact = factorial(num);
        System.out.println("Factorial is >> " + Fact);

        sc.close();

    }
}
