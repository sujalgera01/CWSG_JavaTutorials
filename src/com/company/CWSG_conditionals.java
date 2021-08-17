package com.company;
import java.util.Scanner;

public class CWSG_conditionals {
    public static void main(String[] args) {

//        if-else clause

//        int age = 26;
//        if(age>=18){
//            System.out.println("You can drive");
//        }
//        else{
//            System.out.println("Sorry! You cannot drive");
//        }

//        if - else if clause
//        int age = 22;
//        if(age >50){
//            System.out.println("Experienced");
//        }
//        else if(age > 30){
//            System.out.println("Semi Experienced");
//        }
//        else{
//            System.out.println("NOt Experienced");
//        }


//        Switch Case Control Ins.
        System.out.println("Enter you age: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 18:
                System.out.println("You are an Adult");
                break;
            case 30:
                System.out.println("hectic Schedule");
                break;
            case 60:
                System.out.println("Retire Please..");
                break;
            default:
                System.out.println("Enjoy Life .");
        }
    }
}
