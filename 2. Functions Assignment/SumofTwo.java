import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Please Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter your Second Number: ");
        int num2 = input.nextInt();
        System.out.println("The sum of two numbers is " + sum(num1, num2));

    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
