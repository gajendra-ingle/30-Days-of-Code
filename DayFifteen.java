import java.util.Scanner;

public class DayFifteen {

    // Function that convert a string to lowercase
    static String lowercase(String str) {
    // character array
    char a[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char) (a[i] + 32); // type casting
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string which is to be converted to lowercase :");
        String str = sc.nextLine();

        // call the function
        String outpuString = lowercase(str);
        System.out.print("Lowercase String is : " + outpuString);

        // sc close
        sc.close();
    }
}
