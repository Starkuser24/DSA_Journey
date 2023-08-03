import java.util.Scanner;

public class ArmstrongBtwTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        for(int i=num1;i<num2;i++)
        {
            int rem, arm =0;
            int org=i;
            while(org>0)
            {
                rem=org%10;
                arm = rem*rem*rem + arm;
                org=org/10;
            }
            if(arm==i)
            {
                System.out.println(arm + " is an armstrong number");
            }

        }
    }
}
