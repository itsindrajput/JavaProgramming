import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: \t");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Elements Of The Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findUnique(arr, n);
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int findUnique(int[] arr, int n) {
        Arrays.sort(arr);
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];

        return j;
    }
}
