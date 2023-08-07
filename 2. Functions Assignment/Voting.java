import java.util.Scanner;

public class Voting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        vote(age);
    }
    static void vote(int a){
        if(a>=18){
            System.out.print("You're eligible to Vote.");
        }
        else{
            System.out.print("You're not eligible to Vote.");
        }
    }
}
