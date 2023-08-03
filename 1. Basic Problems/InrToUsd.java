import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number in Indian Currency (INR): ");
        int num = in.nextInt();
        System.out.println(num + " INR will be " + num*0.012 + " USD");
    }
}
