import java.util.Scanner;

public class DayTwentySeven {

    // Function that check greater number among the four number.
    static void checkGreaterNumber(int a, int b, int c, int d) {
       // Logic
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input.
        System.out.print("Enter the four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

         // Function call.
        checkGreaterNumber(a, b, c, d);

        // sc closed
        sc.close();
    }
}
