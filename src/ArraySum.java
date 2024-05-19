import java.util.Arrays;
import java.util.Scanner;
public class ArraySum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: \t");
        int n = sc.nextInt();
        System.out.println("Enter The Elements Of An Array:");
        int [] arr = new int [n];
        int sum =0;
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
//            sum = sum+arr[i];
        }

        sum = Arrays.stream(arr).sum();
        System.out.println("Sum Of Array Element is: \t" + sum);
    }
}
