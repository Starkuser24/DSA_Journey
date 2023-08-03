import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number whose table you want:");
        int num = input.nextInt();
        int mul;
        int i=1;
        for(i=1;i<=10;i++)
        {
            mul = num * i;
            System.out.println(mul);
        }
    }
}
