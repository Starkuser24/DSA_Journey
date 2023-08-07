import java.util.Scanner;

public class Maxandmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1= input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int ans1 = maxi(num1,num2,num3);
        int ans2 = mini(num1,num2,num3);
        System.out.println("The maximum of all three is " + ans1);
        System.out.println("The mimimum of all three is " + ans2);

    }
    static int maxi(int a, int b, int c){
        int max=0;
        max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;

    }
    static int mini(int a, int b, int c){
        int max=0;
        max=a;
        if(b<max){
            max=b;
        }
        if(c<max){
            max=c;
        }
        return max;

    }
}
