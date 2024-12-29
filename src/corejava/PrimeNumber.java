package corejava;
import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();

        boolean isPrime = num > 1;

        for(int i=2;i<= Math.sqrt(num);i++)
        {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is Prime Number.");
        else
            System.out.println(num+ " is not Prime Number.");
    }
}
