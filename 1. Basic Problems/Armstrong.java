import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check wether it's Armstrong number: ");
        int num = input.nextInt();
        int rem,arm =0;
        int org = 0;
        org=num;


        while(org>0){
            rem=org%10;
            arm=rem*rem*rem + arm;
            org=org/10;
        }
        if(arm==num){
            System.out.println("The given number is an Armstrong Number");
        }
        else{
            System.out.println("The given number is not an Armstrong Number");
        }

    }
}
