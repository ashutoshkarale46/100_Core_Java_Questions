package corejava;
import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine().toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString().toLowerCase();

        if(str.equals(reverse)){
            System.out.println(str + " is palindrome.");
        }else{
            System.out.println(str + " is  not a palindrome.");
        }
    }
}
