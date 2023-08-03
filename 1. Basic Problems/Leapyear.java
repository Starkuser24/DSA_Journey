import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        System.out.print("Enter the number of days in the year: ");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        if(days!=365){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}

