import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int marks = input.nextInt();
        Grade(marks);
    }
    static void Grade(int a)
    {
        switch(a/10)
        {
            case 9:
                if(a<101 && a>90)
                {
                    System.out.println("Your Grade is AA");
                    break;
                }

            case 8:
                if(a<91 && a>80)
                {
                    System.out.println("Your Grade is BB");
                    break;
                }
            case 7:
                if(a<81 && a>70)
                {
                    System.out.println("Your Grade is CC");
                    break;
                }
            case 6:
                if(a<71 && a>60)
                {
                    System.out.println("Your Grade is DD");
                    break;
                }

            case 4:
                if(a<51 && a>40)
                {
                    System.out.println("Your Grade is EE");
                    break;
                }
            case 3:
                if(a<=40)
                {
                    System.out.println("Your have failed.");
                    break;
                }
            default:
                System.out.println("Please enter valid marks");
                break;
        }
    }
}
