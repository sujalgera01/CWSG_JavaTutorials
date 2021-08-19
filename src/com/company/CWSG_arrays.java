package com.company;

public class CWSG_arrays {
    public static void main(String[] args) {

//        There are 3 ways to craete an array.
//        1.
        int [] marks;
        marks = new int[5];
        marks[0] = 1;
        marks[1] = 2;

//        2
        int [] marks2 = new int[5];
        marks2[0] = 100;
        marks2[1] = 50;
        marks2[2] = 86;
        marks2[3] = 90;
        marks2[4] = 65;
//        marks[5] = 10;  -- Throws an error
        System.out.println(marks[3]);

//        3
        int [] marks3 = {20,30,40,50,60,72};

//        Array Length
        String [] stud = {"sujal", "anmol"};
        System.out.println(stud.length);

        float [] marks4 = {5.9f,6.3f,2.5f,90};
        System.out.println(marks4.length);
        System.out.println(marks4[3]);

//        Displaying an Array (Naive Approach)
        int [] m = {1,2,3,4,5};
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
        System.out.println(m[3]);
        System.out.println(m[4]);

//        Displaying an Array (For Loop)
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }

        /* Print array in reverse order */
        int [] arr = {10,11,12,13,15};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

//        Displaying elementf of array using for-loop
        for(int i : arr){
            System.out.println(i);
        }












    }
}
