import java.util.Scanner;

public class Ten {

    // function that check number is multiple of 3 and 5.
    static void checkMultiples(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Yes, The given number is multiple of 3 and 5.");
        }else{
            System.out.println("No, The given number is not multiple of 3 and 5.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // call checkMultiple() function
        checkMultiples(num);

        // Scanner close
        sc.close();
    }
}
