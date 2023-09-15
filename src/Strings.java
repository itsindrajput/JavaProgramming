//a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.
//Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
//Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
//Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int pCount = 0;
        int aCount = 0;
        int mCount = 0;

        // Count the occurrences of 'p', 'a', and 'm'
        for (char ch : s.toCharArray()) {
            if (ch == 'p') {
                pCount++;
            } else if (ch == 'a') {
                aCount++;
            } else if (ch == 'm') {
                mCount++;
            }
        }

        // Check if it's possible to make the string empty
        if (pCount % 2 == 0 && aCount % 2 == 0 && mCount % 2 ==0) {
            System.out.println("1"); // It's possible to make the string empty
        } else {
            System.out.println("0"); // It's not possible to make the string empty
        }

    }
}



// Write a program to return a string from a given string s where all occurrences of the
// first char of the string except the first occurrence have been changed to '$'.

//import java.util.Scanner;
//class Strings {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        StringBuilder sb=new StringBuilder(s);
//        Character x=sb.charAt(0);
//        for(int i=1;i<sb.length(); i++){
//            if(x.equals(sb.charAt(i))){
//                sb.replace(i,i+1,"$");
//            }
//        }
////        String result=sb.toString();
//        System.out.println(sb.toString());
//    }
//}



//import java.util.Scanner;
//class Strings {
//    public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
//        String s1 = scn.next();
//        String s2 = scn.next();
//        if(s1 == s2) {
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("Strings are not equal");
//        }
//    }
//}
