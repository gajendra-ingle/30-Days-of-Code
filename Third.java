import java.util.Scanner;

public class Third {

    public static int isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Check it is prime or not
        if (count == 2) {
            System.out.println("It is prime number.");
        } else {
            System.out.println("It is not prime number.");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        isPrime(num);

        sc.close();
    }

}