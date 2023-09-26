// 1. Write a program to print the Sum of two matrix given that there size are same !
/*
import java.util.Scanner;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] a=new int[rows][cols];
        int [][] b=new int[rows][cols];
        matrixRead(a);
        matrixRead(b);

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void matrixRead(int [][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    }
}
* */



/*2. Input Format: First argument is a 2D matrix of integers.
Output Format: You have to return the Transpose of this 2D matrix.*/

/*
public class Array

    public int[][] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] transpose = new int[cols][rows];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                transpose[j][i] = A[i][j];
            }
        }

        return transpose;
    }
}

*
 */


/* 3. Problem Description: You are given a matrix A, you have to return an array containing sum
* of each row elements followed by sum of each column elements of the matrix.*/

/*
import java.util.Scanner;
public class Main {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int [][] arr=new int [rows][cols];
    int [] rowSum=new int[rows];
    int [] colSum=new int[cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            rowSum[i]+=arr[i][j];
        }
    }

    for(int j=0;j<cols;j++){
        for(int i=0;i<rows;i++){
            colSum[j]+=arr[i][j];
        }
    }

    for (int i = 0; i<rows; i++) {
        System.out.println(rowSum[i]);
    }
    for (int j = 0;j<cols; j++) {
        System.out.println(colSum[j]);
    }
    }
}
* */