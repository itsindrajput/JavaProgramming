import java.util.Scanner;
public class SimpleInterest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of P, R, T To Calculate The Simple Intrest:");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("SI = " + si);
    }
}
