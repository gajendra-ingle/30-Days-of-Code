import java.util.Scanner;

public class DayTwenty {
    //function that calculate the square root of the given number
    static int calculateSquareRoot(int num){
        int squareRoot =num*num;
        return squareRoot;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        //call the calculateSquareRoot() function
        int squareRoot = calculateSquareRoot(num);

        System.out.print("The square root of given number is : "+squareRoot);

        
        
    }

}
