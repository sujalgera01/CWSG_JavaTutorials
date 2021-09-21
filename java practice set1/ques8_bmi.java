import java.io.*;

import java.util.Scanner;

public class BmiCalc{

    public static void main(String[] args){

        float bmi=Float.parseFloat(args[1])/(Float.parseFloat(args[2])*Float.parseFloat(args[2]));

         String c;

        if (bmi<18.5) 

            c="Underweight";

        else if (bmi<25)

            c="Normal";

        else if (bmi<30)

            c="overweight";

        else

            c="obese";

        System.out.println(args[0]+"  "+c);

    }

}