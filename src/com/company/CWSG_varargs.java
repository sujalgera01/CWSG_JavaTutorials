package com.company;

public class CWSG_varargs {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }

//    USE of VARARGS..
    static int sum(int ... arr){
        // Take this as int [] arr
        int res = 0;
        for(int i: arr){
            res += i;
        }
        return res;
    }

//    USE of VARARGS with cumpolsary parameter
    static int mul(int a, int ... arr){
    // Take this as int [] arr
        int res = a;
        for(int i: arr){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Nothing is: " + sum());
        System.out.println("Sum of numbers 1 is: " + sum(1));
        System.out.println("Sum of numbers 1 and 2 is: " + sum(1,2));
        System.out.println("Sum of numbers 1 ,2 and 3 is: " + sum(1,2,3));
        System.out.println("Sum of numbers 1 ,2 ,3 and 4 is: " + sum(1,2,3,4));

//        System.out.println("Sum of Nothing is: " + mul());
        System.out.println("Sum of numbers 1 is: " + mul(1));
        System.out.println("Sum of numbers 1 and 2 is: " + mul(1,2));
        System.out.println("Sum of numbers 1 ,2 and 3 is: " + mul(1,2,3));
        System.out.println("Sum of numbers 1 ,2 ,3 and 4 is: " + mul(1,2,3,4));

    }
}
