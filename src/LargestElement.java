import java.util.Scanner;
public class LargestElement  {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: \t");
        int n = sc.nextInt();
        System.out.println("Enter The Elements Of An Array:");
        int[] arr = new int[n];
        int minimum = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            minimum = Math.max(minimum, arr[i]);
        }
        System.out.println("The Largest Element In An Array: \t" + minimum);
    }
}