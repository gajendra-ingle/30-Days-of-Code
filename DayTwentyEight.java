import java.util.Scanner;

public class DayTwentyEight {

    // Function that find the longest word
    static void findLongestWord(String str){
        String a[] = str.split(" ");
        String max = " ";
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > max.length()) {
				max = a[i];
			}
		}
		System.out.print(max);
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string :");
		String str = sc.nextLine();

        // Function call
        findLongestWord(str);

		// sc close
        sc.close();
    }
		
}
