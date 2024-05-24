import java.util.Scanner;

public class RemoveElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: \t");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter The Key to Remove All Its Occurrences from an Array: \t");
        int key = sc.nextInt();
        int count = 0;
        int [] temp = new int[n];
        for(int j=0; j<n; j++){
            if(arr[j] != key){
                temp[count] = arr[j];
                count++;
            }
        }

        for (int z = 0; z<count; z++){
            System.out.print(temp[z] + " ");
        }
    }
}