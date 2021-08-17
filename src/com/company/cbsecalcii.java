package com.company;
import java.util.Scanner;

public class cbsecalcii {
    public static void main(String[] args) {
        System.out.println("enter your marks in a row: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark 1: ");
        float m1 = sc.nextFloat();
        System.out.println("Enter Mark 2: ");
        float m2 = sc.nextFloat();
        System.out.println("Enter Mark 3: ");
        float m3 = sc.nextFloat();
        System.out.println("Enter Mark 4: ");
        float m4 = sc.nextFloat();
        System.out.println("Enter Mark 5: ");
        float m5 = sc.nextFloat();

        float percent = ((m1+m2+m3+m4+m5)/500)*100;
        System.out.println("Your Percentage is: " + percent);

    }
}
