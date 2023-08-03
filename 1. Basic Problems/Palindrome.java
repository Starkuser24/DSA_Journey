import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = input.next();
        int n = word.length();
        int count=0;
        for(int i=0;i<n/2;i++)
        {
            if(word.charAt(i)==word.charAt(n-i-1))
            {
                count++;
            }
            else{
                count=0;
            }
        }
        if(count==n/2){
            System.out.println("The given string *" + word + "* is a palindrome");
        }
        else{
            System.out.println("Given string is not a palindrome");
        }

    }
}
