import java.util.Scanner;

public class ProductofTwo {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Please Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter your Second Number: ");
        int num2 = input.nextInt();
        System.out.println("The product of two numbers is " + mult(num1, num2));

    }
    static int mult(int a, int b){
        int prod = a*b;
        return prod;
    }
}
