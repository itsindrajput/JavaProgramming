import java.util.Scanner;
public class ArrayRotation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: \t");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int track =0;
        System.out.println("Enter The Element Of The Array: ");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Array Position From Where You Want To Rotate: \t");
        int d = sc.nextInt();
        int [] resultArr = new int[n];
        for (int j=d; j<n; j++){
            resultArr[j-d] = arr[j];
            track++;
        }
        for (int k=0; k<d; k++){
            resultArr[track] = arr[k];
            track++;
        }

        System.out.println("Array After Rotation: ");
        for (int z =0; z<n; z++){
            System.out.print(resultArr[z] + " ");
        }
    }
}
