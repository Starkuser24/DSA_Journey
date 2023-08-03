import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Principal Amount: ");
        int p = input.nextInt();
        System.out.print("Enter your Time: ");
        int t = input.nextInt();
        System.out.print("Enter your Rate of Interest: ");
        int r = input.nextInt();
        System.out.println("Your Interest Amount will be: " + ((p*t*r)/100));
    }
}
