import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check whether it is a Palindrome or not");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if(str.equals(rev)){
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not Palindrome!");
        }
    }
}
