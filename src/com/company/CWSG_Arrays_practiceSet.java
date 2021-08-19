package com.company;
import java.util.Scanner;

public class CWSG_Arrays_practiceSet {
    public static void main(String[] args) {
//        1.
        float [] m = {1,2,3,4,5};
        float sum = 0;
        for(float i : m){
            sum = sum + i;
        }
        System.out.println(sum);

//        2.
        int [] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i : arr){
            if(i == x){
                System.out.println("Present");
                break;
            }
            else {
                System.out.println("Not Present");
                break;
            }
        }

//        3
        int [] mark = {12,12,15,15,16,19};
        float summ = 0, avg = 0;
        for(int i : mark){
            summ = summ + i;
        }
        System.out.println(summ/ mark.length);

//        4
//        To Be Continued...
    }
}
