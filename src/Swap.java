import java.util.Scanner;
public class Swap {
    public static void main(String [] args){
        System.out.println("Enter Two Numbers: To Swap");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: \t");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number: \t");
        int b = sc.nextInt();

//      Using The Third Variable
//        int c = 0;
//         c = a;
//         a = b;
//         b = c;

//      Using The XOR Operator
//           a = a^b;
//           b = a^b;
//           a = a^b;

//      Using The Product Mulitplication
         a = a*b;
         b = (a/b);
         a= (a/b);

        System.out.println("First Number: \t" + a);
        System.out.println("Second Number: \t" + b);
    }
}
