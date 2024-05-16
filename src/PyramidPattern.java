import java.util.Scanner;
public class PyramidPattern {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Values OF N: \t");
        int n = sc.nextInt();
        int z=1;
        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=z; k++){
                System.out.print("*");
            }
            z +=2;
            System.out.println();
        }
    }
}
