//Write a java program to Computing a Factorial of a given number.
/*
import java.util.Scanner;
class  Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int factorial=1;
        int num=sc.nextInt();
        while(num>0){
            factorial*=num;
            num--;
        }
        System.out.println(factorial);
    }
}
**/


//This program will compute the factorial of all size of integer value.
/*
import java.math.BigInteger;
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int factorial=1;
        BigInteger factorial=new BigInteger(1+"");
        int num=sc.nextInt();
        while(num>0){
//            factorial*=num;
            BigInteger temp=new BigInteger(num+"");
            factorial=factorial.multiply(temp);
            num--;
        }
        System.out.println(factorial);
    }
}

**/