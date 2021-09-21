import java.io.*;
import java.util.Scanner;
class ct1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i,n,x,j;
        int[][] arr=new int[4][];
         for(i=0;i<4;i++){
            System.out.println("Enter number of students in CSE1007 batch"+(i+1));
            x=in.nextInt();
            n=(x/4)+((x/4)*4==x?0:1);
            arr[i]=new int[n];
            for(j=0;j<n;j++,x-=4) 
				arr[i][j]=x>4?4:x;
        }
        System.out.println("We constructed the array, now we parse it:");
        int total=0;
        for( i=0;i<4; i++){
            System.out.println("");
            System.out.println("BATCH: "+(i+1));
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+", ");
                if(arr[i][j]==4) 
					total++;
            }
        }
        System.out.println("Total number of complete groups are: "+ total);
    }
}