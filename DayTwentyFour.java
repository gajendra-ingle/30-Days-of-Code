import java.util.Scanner;

public class DayTwentyFour {

    public static void isArmstrongNumber(int number) {

        int count = 0, a, b, c, sum = 0;
        a = number;
        c = number;

        while (a > 0) {
            a = a / 10;
            count++;
        }
        while (number > 0) {
            b = number % 10;
            sum = (int) (sum + Math.pow(b, count));
            number = number / 10;
        }
        if (sum == c) {
            System.out.println(c + " is an Armstrong number");
        } else {
            System.out.println(c + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // call the isArmstrongNumber function
        isArmstrongNumber(number);
    }
}
