import java.util.Scanner;

public class First{
 
static void evenOdd(int num){
    if(num % 2==0){
        System.out.println("True");
    }else{
        System.out.println("False");
    }
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();
        evenOdd(num);
         

    }
}