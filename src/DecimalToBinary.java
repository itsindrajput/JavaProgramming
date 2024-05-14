import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number To Convert It Into Binary: \t");
        int num = sc.nextInt();
        int copy = num;
        int [] arr = new int [100];
        int i=0;
        while(num > 0){
            arr[i] = num % 2;
            num /= 2;
            i++;
        }

        System.out.format("The Binary Of %d is \t", copy);
        for(int j=i-1; j>=0; j--){
            System.out.print(arr[j]);
        }
    }
}