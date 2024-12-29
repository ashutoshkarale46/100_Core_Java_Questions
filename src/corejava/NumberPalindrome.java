package corejava;
import java.util.Scanner;

public class NumberPalindrome
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int originalNum = num,rev = 0;

        while(num != 0)
        {
            int rem = num%10;
            rev = rev*10 + rem;
            num= num/10;
        }

        if(originalNum == rev){
            System.out.println(originalNum + " is a Palindrome Number.");
        }else{
            System.out.println(originalNum + " is not a Palindrome Number.");
        }
    }
}
