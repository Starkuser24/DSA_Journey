import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your Second number: ");
        int num2 = input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of both the numbers is: "+sum);
    }
}
