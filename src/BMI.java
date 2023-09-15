/*
BMI Calculator
Problem Description -
Given the height (A) and weight (B) of a person as input in centimetres and kilograms.
Find the BMI of that person and the classification of the user based on their BMI.
Print Underweight if BMI < 18.5
Print Normal if BMI lies in the range [18.5, 24.9]
Print Overweight if BMI lies in the range (24.9, 29.9]
Print Obese if BMI is greater than 29.9
If x is the weight in kilograms and y is the height in metres.

Then, BMI is calculated as x/(y*y).

 Note: Use Math.round(BMI*10)/10d get only one digit after decimal

Problem Constraints -
1 <= A <= 180
1 <= B <= 120
Input Format
The first line contains the height of the person in centimetres.
The second line of the input contains the weight of the person in kilograms.

Output Format -
The first line of the output contains the classification of a person based on the BMI value.
The second line of the output contains the BMI value of the person having only one digit after decimal.

Sample Input -
Input 1:
101
29

Input 2:
129
31

Sample Output -
Output 1:
Overweight
28.4
Output 2:
Normal
18.6
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a scanner to read input from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Read height in centimeters
        int heightInCm = scanner.nextInt();

        // Read weight in kilograms
        int weightInKg = scanner.nextInt();

        // Convert height to meters (as BMI formula requires height in meters)
        double heightInM = heightInCm / 100.0;

        // Calculate BMI
        double bmi = weightInKg / (heightInM * heightInM);

        // Round BMI to one decimal place
        double roundedBMI = Math.round(bmi * 10) / 10.0;

        // Determine BMI classification
        String classification;
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            classification = "Normal";
        } else if (bmi > 24.9 && bmi <= 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }

        // Print classification and rounded BMI
        System.out.println(classification);
        System.out.println(roundedBMI);

        // Close the scanner
        scanner.close();
    }
}
