/*
find the number of days it will take to reach zero cases of Corona in a city.
A - Average cases recovered in a day of the corona.
B - Number of new cases of corona daily.
C - Current active cases of the corona.
Return the minimum number of days it will take to reach 0 active cases of Covid.
*/

import java.util.Scanner;

public class Fun {
    public static int solve(int A, int B, int C) {


        int days = 0;
        while (C > 0) {
            C += B;  // Increase cases with new cases
            C -= A;  // Decrease cases with recovered cases*/
            days++;
            if (C <= 0) {
                break;
            }
        }
        return days;
    }

    public static void main(String []args){
        System.out.println(solve(5,3,1 ));
        System.out.println(solve(4,3,2 ));
    }
}