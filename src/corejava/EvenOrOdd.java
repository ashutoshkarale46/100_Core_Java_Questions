package corejava;
import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();

        if(num%2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
