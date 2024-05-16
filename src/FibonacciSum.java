import java.util.Scanner;
public class FibonacciSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N: \t");
        int n = sc.nextInt();
        fibonacciSeries(n);
        fibonacciSum(n);
    }
    static void fibonacciSeries(int num){
        int a =0;
        int b = 1;
        int result = 0;

        System.out.printf("%d\t%d\t", a, b);
        for(int i=1; i<=num; i++){
            result = a + b;
            System.out.print(result + "\t");
            a = b;
            b = result;
        }
    }

    static void fibonacciSum(int num) {
        int a = 0, b = 1;
        int res = a+b;
        for(int j = 1; j<=num; j++){
            res = a + b;
            a = b;
            b = res;
        }
        System.out.printf("\n The Sum Of Fibonacci Series is: %d \t", res);
    }
}
