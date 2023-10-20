import java.util.Scanner;

public class DayFourteen {
    // Function that convert a string to upper case
    static String uppercase(String str) {
        // character array
        char a[] = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
         // condition
         if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] = (char) (a[i] - 32); // type casting

            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string which is to be converted to uppercase :");
        String str = sc.next();

        // call uppercase() function
        String output = uppercase(str);
        System.out.println("Uppercase String is : " + output);

        //sc closed
        sc.close();
    }
}
