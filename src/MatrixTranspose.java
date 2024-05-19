import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Rows: \t");
        int rows = sc.nextInt();
        System.out.print("Enter The Number Of Columns: \t");
        int columns = sc.nextInt();
        int [][] arr = new int[rows][columns];
        System.out.println("Enter The Element Of An Array:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        /*
        In The Above Loop I Have taken the input row wise. And to get the transpose print the
        same matrix column wise.
         */
        System.out.println("Transpose Of The Above Matrix is: ");
        for(int j=0; j<columns; j++){
            for(int i=0; i<rows; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
