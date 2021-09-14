package com.company;

import java.util.Scanner;

class ProdOfNums{
    int product(int[] arr){
        int prod = 1;
        for(int i: arr){
            prod = prod*i;
        }

        return prod;
    }

    int product(char x, int[] brr){
        int prod = 1;
        int n = brr.length;
        if(x == 'E'){
            for(int i=0;i<n;i+=2){
                prod = prod*brr[i];
            }
            return prod;
        }
        else if(x == 'O'){
            for(int i=1;i<n;i+=2){
                prod = prod*brr[i];
            }
            return prod;
        }
        else {
            return 0;
        }
    }
}

public class ProductOfNumbers {
    public static void main(String[] args) {
        ProdOfNums p = new ProdOfNums();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        int res = p.product(a);
        System.out.println(res);
        //p.product('E',a);
        //p.product('O',a);
        //p.product('A',a);
    }
}


