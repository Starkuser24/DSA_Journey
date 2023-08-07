import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        prime(num);

    }
    static void prime(int a) {
        for (int i = 2; i <= a; i++)
        {
            if (a%i==0) {
                System.out.println("The " + a + " is not a Prime Number");
                break;
            }
            else{
                System.out.println("The " + a + " is a Prime Number");
                break;
            }

        }

    }
}
