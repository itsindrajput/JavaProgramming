import java.util.Scanner;
public class PascalTriangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Lines: ");
        int n = sc.nextInt();
        int number = 1;
        for(int i =0; i<n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            number=1;
            for(int k = 0; k<=i; k++){
                System.out.print(number + " ");
                number = number * (i-k) / (k+1);
            }
            System.out.println();
        }
    }
}
