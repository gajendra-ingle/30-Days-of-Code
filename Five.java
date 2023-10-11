import java.util.Scanner;

public class Five {

    public static int chechPositiveOrNegative(int num) {
        if (num > 0) {
            System.out.println("Positive Number.");
        } else {
            System.out.println("Negative Number.");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        chechPositiveOrNegative(num);

        sc.close();

    }
}
