import java.util.Scanner;

public class Second {
    static String isEmpty(String str) {
        if (str.length() == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        isEmpty(str);

        sc.close();
    }
}
