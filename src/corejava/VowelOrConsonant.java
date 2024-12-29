package corejava;
import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = s.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is vowel.");
        } else if(Character.isLetter(ch)){
            System.out.println(ch + " is Consonant.");
        }else{
            System.out.println(ch + " is not a valid letter.");
        }
    }
}
