//Given an array generate a new array that is the reverse of it.
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of An Array..!");
        int N=sc.nextInt();
        System.out.println("Enter The Elements Of An Array..!");
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=N-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}



//Given an array find the maximum and minimum elements of it.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Size Of Array!");
//        int N=sc.nextInt();
//        int [] arr=new int[N];
//        for(int i=0; i<N;i++){
//            arr[i]=sc.nextInt();
//        }
//        int x=arr[0],y=arr[0];
//        for(int i=0; i<N; i++){
//            x=Math.max(x,arr[i]);
//            y=Math.min(y,arr[i]);
//        }
//        System.out.println("Maximum No:" + x);
//        System.out.println("Minimum No:" + y);
//    }
//}



//Java Program to Find Common Elements Between Two Arrays
//import java.util.Scanner;
//import java.util.HashSet;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Size Of The Array!");
//        int N = sc.nextInt();
//
//        int[] arr1 = new int[N];
//        System.out.println("Enter The Elements Of The First Array!");
//        for (int i = 0; i < N; i++) {
//            arr1[i] = sc.nextInt();
//        }
//
//        int[] arr2 = new int[N];
//        System.out.println("Enter The Elements Of The Second Array!");
//        for (int i = 0; i < N; i++) {
//            arr2[i] = sc.nextInt();
//        }
//
//        HashSet<Integer> commonElements = new HashSet<>();
//        HashSet<Integer> arr1Set = new HashSet<>();
//
//        for (int num : arr1) {
//            arr1Set.add(num);
//        }
//
//        for (int num : arr2) {
//            if (arr1Set.contains(num)) {
//                commonElements.add(num);
//            }
//        }
//
//        System.out.println("Common Elements: ");
//        for (int element : commonElements) {
//            System.out.print(element + " ");
//        }
//    }
//}



// Generate and print an array containing square of all numbers from 1 To N.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int N = sc.nextInt();
//        int [] arr=new int[N];
//        for(int i=1; i<=N;i++){
//            arr[i-1]=i*i;
//        }
//        for(int i=0; i<N;i++){
//            System.out.println(arr[i]);
//        }
//
//    }
//}




