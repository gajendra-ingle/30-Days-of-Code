public class DayTwentySix {

    // function that swap two number
    static void swapNumber(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the swap number
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        // Print original number
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Function call
        swapNumber(num1, num2);

    }
}
