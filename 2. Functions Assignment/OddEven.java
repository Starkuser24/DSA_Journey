import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        Evenodd(num);
    }

    static void Evenodd(int a){
        if(a%2==0){
            System.out.println("The number 12"+ a+" is Even");
        }
        else{
            System.out.println("The number "+ a +" is Odd");
        }
    }
}
