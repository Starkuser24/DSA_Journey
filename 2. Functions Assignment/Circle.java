import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of cirle: ");
        int rad = input.nextInt();
        System.out.println("The Circumference of the Circle with radius" + rad + " is " + circum(rad));
        System.out.println("The Area of the Circle with radius" + rad + " is " + area(rad));

    }
    static float circum(int a)
    {
        float cir = 2 * 3.14f * a;
        return cir;
    }
     static float area(int a){
        float area = 3.14f * a * a;
        return area;
     }
}
