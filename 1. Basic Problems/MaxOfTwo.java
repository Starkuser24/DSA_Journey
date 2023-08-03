import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("The largest number is: "+ num1);
        }
        else{
            System.out.println("The largest number is: "+ num2);
        }
    }
}
