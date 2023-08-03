import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the operation you want to perform: ");
        char ch = input.next().trim().charAt(0);
        if(ch=='+') {
            System.out.println(num1 + num2);
        } else if(ch==-'-'){
                System.out.println(num1-num2);
            }
        else if(ch=='*'){
            System.out.println(num1*num2);
        }
        else if(ch=='/'){
            System.out.println(num1/num2);
        }

        }


    }

