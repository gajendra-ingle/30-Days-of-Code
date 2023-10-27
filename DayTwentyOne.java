
public class DayTwentyOne {

    // function that remove space
    static int removeSpaces(char[] str) {
        int count = 0; // to track spaces seen so far

        for (int i = 0; i < str.length; i++)
            if (str[i] != ' ') { // if whitespace is present
                str[count] = str[i]; // remove whitespace
                count++; // increment count
            }

        return count;
    }

    public static void main(String[] args) {

        char[] str = "Take you forward ".toCharArray();
        int count = removeSpaces(str);
        System.out.println(String.valueOf(str).subSequence(0, count));

    }
}
