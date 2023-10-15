import java.util.Scanner;

public class Nine {

    // Calculate string length function
    static int calculateStringLength(String str) {
        int length = 0;

        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        // // Call the calculateStringLength() function.
        int length = calculateStringLength(str);
        System.out.println("Length of given string is : " + length);

        sc.close();
    }
}
