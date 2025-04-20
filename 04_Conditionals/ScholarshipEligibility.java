/*
 * write a program in java to determine whether a student is elligible for a scholarship based on their grades or stars received in sports.
 * GPA should be >= 3.5
 * stars in sports >= 3
 */

import java.util.*;

class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA and stars respectively");
        float grades = sc.nextFloat();
        float stars = sc.nextFloat();
        if (grades >= 3.5 || stars >= 3) {
            System.out.println("Elligible");
        } else {
            System.out.println("Mot Elligible");
        }
        sc.close();
    }
}