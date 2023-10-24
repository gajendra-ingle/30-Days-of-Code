import java.util.Scanner;

public class DayEighteen {

    // function that find duplicate characters
    static void findDupliacteCharacter(String str) {
        // convert string into array
        char string[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    System.out.print(string[j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        // call the countDupliacteCharacter() function
        System.out.print("Duplicate characters are : ");
        findDupliacteCharacter(str);

        //sc closed
        sc.close();

    }
}
