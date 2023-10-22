import java.util.Scanner;

public class DaySixteen {
    //Function that checks the character vowel or consonent
    static void checkCharacter(char ch){
        System.out.println(ch);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.println("Enter any one character : ");
        char ch = sc.next().charAt(0);

        checkCharacter(ch);

        //sc closed
        sc.close();
    }

}
