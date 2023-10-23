import java.util.Scanner;

public class DaySeventeen {

    // function that reverse a number
    static int reverseNumber(int num) {
        int reverse = 0;
        int remainder;

        // condition
        while (num > 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // take user input
        System.out.print("Enter the number that you want to reverse : ");
        int num = sc.nextInt();

        //Print the output on the console      
        System.out.print("Reverse number is : " + reverseNumber(num));


        // sc closed
        sc.close();
    }

}
