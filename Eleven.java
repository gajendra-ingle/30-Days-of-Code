import java.util.Scanner;

public class Eleven {

    // function that checks the given year is leap or not.
    static void checkLeapYear(int year){
        
        if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0 ){
              System.out.println("Yes, It's a leap year.");
        }else{
            System.out.println("No, It's not a leap year.");
     
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        // call the checkLeapYear() function.
        checkLeapYear(year);

        sc.close();
    }
}
