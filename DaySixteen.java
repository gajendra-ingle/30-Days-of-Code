import java.util.Scanner;

public class DaySixteen {
    // Function that checks the character vowel or consonent
    static void checkCharacter(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("it's a vowel..");
        } else {
            System.out.println("it's a consonent..");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter any one character : ");
        char ch = sc.next().charAt(0);

        // Call checkCharacter() function
        checkCharacter(ch);

        // sc closed
        sc.close();
    }

}
