/*
 * write a program in java to determine whether a student is elligible for a scholarship based on their grades or stars received in sports.
 * only after student has cleared the scholarship exam 
 * scholarship exam cutoff: 65
 * GPA should be >= 3.5
 * stars in sports >= 3
 */

import java.util.*;

class ScholarElligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the schoalrship exam marks");
        double marks = sc.nextDouble();
        System.out.println("Enter GPA and stars respectively");
        float grades = sc.nextFloat();
        float stars = sc.nextFloat();
        // one way of giving the condition
        // if (marks >= 65) {
        //     if (grades >= 3.5 || stars >= 3) {
        //         System.out.println("Elligible");
        //     } else {
        //         System.out.println("Mot Elligible");
        //     }
        // }

        // another way of giving the condition
        if (marks >= 65 && (grades >= 3.5 || stars >= 3)) {
            System.out.println("Elligible");
        } else {
            System.out.println("Mot Elligible");
        }

        // System.out.println("Not Elligible");
        sc.close();
    }
}
