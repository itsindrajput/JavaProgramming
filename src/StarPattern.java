import java.util.Scanner;
public class StarPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N: \t");
        int n = sc.nextInt();
        /* Below Logic Is Used To Print The Left Triangular Pattern
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        System.out.println("Left Triangular Pattern");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        /* Below Logic Is Used To Print The Right Triangular Pattern
                 *
               * *
             * * *
           * * * *
         * * * * *
         */
        System.out.println();
        System.out.println("Right Triangular Pattern");
        for(int i=1; i<=n; i++){
            for(int j = n - i; j>0; j--){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        /* Below Logic Is Used To Print The Diamond Shape Pattern
             *
            ***
           *****
          *******
         *********
          *******
           *****
            ***
             *
         */
        System.out.println();
        System.out.println("Diamond Shape Pattern");
        int z=1;
        for(int i=1; i<=n; i++){
            int j;
            for(j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=z; k++){
                System.out.print("*");
            }
            System.out.println();
            z=z+2;
        }
        int temp = n-2;
        int star = (2*temp) + 1;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=star; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
            star = star -2;
        }
    }
}
